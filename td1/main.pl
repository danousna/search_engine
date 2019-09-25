#!/usr/bin/perl 
use strict;
use warnings;

my @files = `ls OLD_BULLETINS_LO17/*.htm`;

my $output = "<corpus>";

my %cmds = ( 
    "numero" => 'grep \'style32">BE France\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "date" => 'grep \'style32">BE France\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "rubrique" => 'grep \'<p class="style96"><span class="style42">\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "titre" => 'grep \'<span class="style17">\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "texte" => 'grep \'<p class="style96"><span class="style95">\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "images_url" => 'grep \'<div style="text-align: center">.*<img src="\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "images_legende" => 'grep \'<span class="style21"><strong>\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l',
    "contact" => 'grep \'<p class="style44"><span class="style85">\' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l'
);
my %log = ( 
    # "fichiers" => 0,
    "numero" => 0,
    "date" => 0,
    "rubrique" => 0,
    "titre" => 0,
    "texte" => 0,
    "images_url" => 0,
    "images_legende" => 0,
    "contact" => 0
);

foreach my $filename(@files) {
    open my $filecontent, $filename or die "Could not open $filename: $!";
    
    $output = $output."<bulletin><fichier>$filename</fichier>";
    #++$log{fichiers};

    my $line_count = 0;

    my $article_has_begun = 0;

    my $image = "";
    my $image_found_page = 0; 

    my $text = "";
    my @images;

    # Save contact in variable to put it at the end of the xml block.
    my $contact = "";

    my $r = 0;

    while (my $line = <$filecontent>) {
        ++$line_count;

        # Replace html entities with correct accents
        unless($line =~ /"style32">BE France (\d+).*&nbsp;(\d+\/\d+\/\d+)/) {
            $line =~ s/&nbsp;/ /g;
            $line =~ s/&ecirc;/ê/g;
            $line =~ s/&ouml;/ö/g;
            $line =~ s/&ucirc;/û/g;
            $line =~ s/&egrave;/è/g;
            $line =~ s/&icirc;/î/g;
            $line =~ s/&eacute;/é/g;
            $line =~ s/&quot;/'/g;
            $line =~ s/&agrave;/à/g;
            $line =~ s/&acirc;/â/g;
            $line =~ s/&iuml;/ï/g;
            $line =~ s/&ocirc;/ô/g;
            $line =~ s/&ccedil;/ç/g;
            $line =~ s/&euml;/ë/g;
            $line =~ s/&ugrave;/ù/g;
            $line =~ s/&szlig;/ß/g;
            $line =~ s/&uuml;/ü/g;
            $line =~ s/&amp;/et/g;
            $line =~ s/&deg;/°/g;
            $line =~ s/&ograve;/ò/g;
            $line =~ s/&ecirc;/ê/g;
            $line =~ s/&#338;/Œ/g;
            $line =~ s/&#8211/—/g;
            $line =~ s/&#21;/--/g;
        }

        # Get numero and date
        if ( $line =~ /class="style32">BE France (\d+).*class="style42">.*;(\d{1,2}\/\d{1,2}\/\d{4})<\/span><\/p><\/td>/ ) {
            my $date = $2;
            if (length $date == 9) {
                $date = "0".$date;
            }
            $output = $output."<numero>$1</numero><date>$date</date>";
            ++$log{numero};
            ++$log{date};
        } 

        # Get rubrique
        if ( $line =~ /<span class="style42">(.*)<br>/ ) {
            $output = $output."<rubrique>$1</rubrique>";
            $r = 1;
            ++$log{rubrique};
        }
        
        # Get titre
        if ( $line =~ /<span class="style17">(.*)<\/span>/ ) {
            $output = $output."<titre>$1</titre>";
            ++$log{titre};
        } 

        # Get texte
        if ( $line =~ /<td width=452 valign=top bgcolor="#f3f5f8" class="FWExtra2">/ ) {
            $article_has_begun = 1;
        }
        if ( $article_has_begun == 1 and ( $line =~ /<span class="style95">(.*)<\/span>/ or $line =~ /<span class="style95">(.*)/ ) ) {
            my $match = $1;
            # Replace all "br" tags with empty string
            $match =~ s/<br \/>|<br>/ /g;
            # # Replace all "b" tags with empty string
            $match =~ s/<b[^>]*>|<\/b>/ /g;
            # # Replace all "a" tags with empty string
            $match =~ s/<a[^>]*>|<\/a>/ /g;

            $text = $text.$match;
        }
        if ( $line =~ /<\/td>/ and $article_has_begun == 1 ) {
            $article_has_begun = 0;
        }

        # Get images
        if ( $line =~ /<div style="text-align: center">.*<img src="(.*?)"[^>]*>/ ) {
            $image = $image."<url>$1</url>";
            $image_found_page = $line_count;
            ++$log{images_url};
        }

        if ( $line_count == $image_found_page + 1 ) {
            if ( $line =~ /<span class="style21"><strong>(.*?)<\/strong>/ ) {
                $image = $image."<legende>$1</legende>";
                ++$log{images_legende};
            }

            if ( $image ne "" ) {
                push @images, $image;
            }

            $image_found_page = 0;
        }

        # Get contact
        if ( $line =~ /<p class="style44"><span class="style85">(.*)<\/p>/ ) {
            my $match = $1;
            # Replace all "br" tags with empty string
            $match =~ s/<br \/>|<br>/ /g;
            # # Replace all "b" tags with empty string
            $match =~ s/<b[^>]*>|<\/b>/ /g;
            # # Replace all "a" tags with empty string
            $match =~ s/<a[^>]*>|<\/a>/ /g;
            # # Replace all "span" tags with empty string
            $match =~ s/<span[^>]*>|<\/span>/ /g;

            $contact = "<contact>$match</contact>";
            ++$log{contact};
        }
    }

    if ($text ne "") {
        $output = $output."<texte>$text</texte>";
        ++$log{texte};
    } else {
        print $filename;
    }
    
    if (@images) {
        $output = $output."<images>";

        foreach my $image (@images) {
            $output = $output."<image>$image</image>";
        }

        $output = $output."</images>";
    }

    if ($contact ne "") {
        $output = $output.$contact;
    }

    if ($r == 0) {
        print $filename;
    }

    $output = $output."</bulletin>";
}

$output = $output."</corpus>";

unless(open FILE, ">corpus.xml") {
    die "\nUnable to open corpus.xml\n";
}

print FILE $output;
close FILE;

print "Results :\n";
foreach my $key (keys %log) {
    my $grep = `$cmds{$key}`;
    print $grep;

    my $msg = "- $key : $log{$key}";
    
    $msg = $msg."\n";
    
    print $msg;
}
