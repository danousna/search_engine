#!/usr/bin/perl 
use strict;
use warnings;

# Workflow : perl main.pl

# Check numéro class is in all files.
# grep 'style32">BE France' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l

my @files = `ls OLD_BULLETINS_LO17/*.htm`;

my $output = "<corpus>";

my $filecount = 0;
foreach my $filename(@files) {
    open my $filecontent, $filename or die "Could not open $filename: $!";

    $filecount++;
    
    my $found = 0;

    $output = $output."<bulletin><fichier>$filename</fichier>";

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

        # Get number and date
        if ( $line =~ /class="style32">BE France (\d+).*class="style42">.*;(\d{1,2}\/\d{1,2}\/\d{4})<\/span><\/p><\/td>/ ) {
            $found = 1;
            my $date = $2;
            if (length $date == 9) {
                $date = "0".$date;
            }
            $output = $output."<numero>$1</numero><date>$date</date>";
        } 

        # Get rubrique
        if ( $line =~ /<span class="style42">(([A-zÀ-ÿ]+ )*([A-zÀ-ÿ]*))<br>/ ) {
            $found = 1; 
            $output = $output."<rubrique>$1</rubrique>";
        }
        
        # Get title
        if ( $line =~ /<span class="style17">(.*)<\/span>/ ) {
            $found = 1;
            $output = $output."<titre>$1</titre>";
        } 

        # Get text 

        # Get images

        # Get contact
    }

    if ($found == 0) {
        print "Not found in $filename \n";
    }

    $output = $output."</bulletin>";
}

$output = $output."</corpus>";

unless(open FILE, ">corpus.xml") {
    die "\nUnable to open corpus.xml\n";
}

print FILE $output;
close FILE;
