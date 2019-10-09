#!/usr/bin/perl

# perl stoplist.pl coefficients.txt > stoplist.txt

my %stoplist = ();
my $threshold = 0.2; # arbitraire af

while (<>) {
    if ( /(.*)\t(.*)\t(.*)/i ) {
        if ( $3 > $threshold ) { # reverse to make golist
            $stoplist{$2} = 1;
        }
    }
}

foreach my $word (sort (keys %stoplist)) {
    print $word."\n";
}
