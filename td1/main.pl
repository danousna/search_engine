#!/usr/bin/perl 
use strict;
use warnings;

# Workflow : cat OLD_BULLETINS_LO17/67068.htm | perl main.pl > index.xml

# Check numéro class is in all files.
# grep 'style32"' OLD_BULLETINS_LO17/*.htm | uniq -c | wc -l

# @ls for all the files

while (<>) {
    if ( $_ =~ /class="style32">BE France (\d+).*class="style42">.*(\d{2}\/\d{2}\/\d{4})<\/span><\/p><\/td>/ ) {
        print "$1 $2";
    }
}
