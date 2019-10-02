#!/usr/bin/perl

sub log10 {
    my $n = shift;
    return log($n)/log(10);
}

# perl coefficients.pl segmentation.txt > coefficients.txt

my %dict_occurence = ();
my %dict_coeffs = ();
my $dict_files = ();

while (<>) {
    if ( /(.*)\t(.*)/i ) {
        if ($dict_occurence{$2.','.$1}) {
            ++$dict_occurence{$2.','.$1};
        } else {
            $dict_occurence{$2.','.$1} = 1;
        }
    }
}

foreach my $k (keys(%dict_occurence)) {
    my @spl = split(',', $k);

    if ($dict_coeffs{$spl[1]}) {
        ++$dict_coeffs{$spl[1]};
    } else {
        $dict_coeffs{$spl[1]} = 1;
    }

    $dict_files{$spl[0]} = 1;
}

$n = keys %dict_files;

foreach my $k (keys(%dict_coeffs)) {
    $dict_coeffs{$k} = log10($n / $dict_coeffs{$k});
}

foreach my $k (keys(%dict_occurence)) {
    my @spl = split(',', $k);
    $filename = $spl[0];
    $word = $spl[1];
    my $result = $dict_occurence{$k} * $dict_coeffs{$word};

    print "$filename\t$word\t$result\n";
}
