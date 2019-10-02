#!/usr/bin/perl

# perl coefficients.pl segmentation.txt > coefficients.txt

my %dict = ();

while (<>) {
    if ( /(.*)\t(.*)/i ) {
        if ($dict{$2.','.$1}) {
            ++$dict{$2.','.$1};
        } else {
            $dict{$2.','.$1} = 1;
        }
    }
}

foreach my $k (keys(%dict)) {
    my @spl = split(',', $k);
    print "$spl[0]\t$spl[1]\t$dict{$k}\n";
}
