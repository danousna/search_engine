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
        if ( $line =~ /class="style32">BE France (\d+).*class="style42">.*;(\d{1,2}\/\d{1,2}\/\d{4})<\/span><\/p><\/td>/ ) {
            my $number = $1;
            my $date = $2;

            if (length $date == 9) {
                $date = "0".$date;
            }
            $output = $output."<numero>$number</numero><date>$date</date>";
            $found = 1;
        }
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
