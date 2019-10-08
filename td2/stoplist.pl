#!/usr/bin/perl

# perl stoplist.pl coefficients.txt > stoplist.txt

my %stoplist = ();
my $threshold = 1.5; # arbitraire af

while (<>) {
    if ( /(.*)\t(.*)\t(.*)/i ) {
        if ( $3 <= $threshold ) {
            $stoplist{$2} = 1;
        }
    }
}

foreach my $word (keys(%stoplist)) {
    print $word."\n";
}
