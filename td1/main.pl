#!/usr/bin/perl 
use strict;
use warnings;

# Workflow : perl main.pl

# Check numéro class is in all files.
# grep 'style32">BE France' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l

my @files = `ls OLD_BULLETINS_LO17/*.htm`;

my $output = "<corpus>";

my %log = ( 
    "fichiers" => 0,
    "numero" => 0,
    "date" => 0,
    "rubrique" => 0,
    "titre" => 0,
    "texte" => 0,
    "images" => 0,
    "contact" => 0
);

foreach my $filename(@files) {
    open my $filecontent, $filename or die "Could not open $filename: $!";
    
    $output = $output."<bulletin><fichier>$filename</fichier>";
    ++$log{fichiers};

    while (my $line = <$filecontent>) {
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
        if ( $line =~ /<span class="style42">(([A-zÀ-ÿ]+ )*([A-zÀ-ÿ]*))<br>/ ) {
            $output = $output."<rubrique>$1</rubrique>";
            ++$log{rubrique};
        }
        
        # Get titre
        if ( $line =~ /<span class="style17">(.*)<\/span>/ ) {
            $output = $output."<titre>$1</titre>";
            ++$log{titre};
        } 

        # Get texte
        # $output = $output."<texte>";
        # if ( $line =~ /<span class="style17">(.*)<\/span>/ ) {
        #     $output = $output."<titre>$1</titre>";
        #     ++$log{texte};
        # }
        # $output = $output."</texte>";

        # Get images

        # Get contact
    }

    $output = $output."</bulletin>";
}

$output = $output."</corpus>";

unless(open FILE, ">corpus.xml") {
    die "\nUnable to open corpus.xml\n";
}

print FILE $output;
close FILE;

print "Log :\n";
foreach my $key (keys %log) {
    my $msg = "- $key : $log{$key}";
    if ($log{$key} != $log{fichiers}) {
        $msg = $msg." --> erreur";
    }
    $msg = $msg."\n";
    print $msg;
}
