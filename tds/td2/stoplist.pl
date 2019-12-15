#!/usr/bin/perl

# perl stoplist.pl coefficients.txt > stoplist.txt

my %stoplist = ();
my $threshold = 1.2; # scientifiques

while (<>) {
    if ( /(.*)\t(.*)/i ) {
        if ( $2 <= $threshold ) { # reverse to make golist
            $stoplist{$1} = 1;
        }
    }
}

foreach my $word (sort (keys %stoplist)) {
    print $word."\n";
}
