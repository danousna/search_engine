#!/usr/bin/perl 
use strict;
use warnings;

# Workflow : cat OLD_BULLETINS_LO17/67068.htm | perl main.pl > index.xml

# Check numéro class is in all files.
# grep 'style32">BE France' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l

# @ls for all the files

my @files = `ls OLD_BULLETINS_LO17/*.htm`;

my $i = 0;

foreach my $filename(@files) {
    open my $filecontent, $filename or die "Could not open $filename: $!";

    $i++;
    my $found = 0;

    while (my $line = <$filecontent>) {
        if ( $line =~ /class="style32">BE France (\d+).*class="style42">.*(\d{1,2}\/\d{1,2}\/\d{4})<\/span><\/p><\/td>/ ) {
            print "$i : $1 $2 \n";
            $found = 1;
        }
    }

    if ($found == 0) {
        print "Not found in $filename";
    }
}
