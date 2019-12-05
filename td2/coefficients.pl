#!/usr/bin/perl


## A FAIRE :
# Moyenne des coefficients des termes pour avoir une meilleure idée.
# Ex :
# recherche 0.8???
# pour  0.9???
# pour ...
# pour ...
# recherche 1.???
# Si on prend le min de recherche, on a des mots inutiles
# Si on prend le max de recherche, on loupe peut-être des mots intéressant
# Si on fait la moyenne, on devrait plus ou moins avoir :
# pour
# recherche
# Et donc on prend bien recherche et on loupe rien.

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

# dict_occurence :
#
# 67068.htm,physique  3
# 67068.htm,test  1
# 67069.htm,physique  2

foreach my $k (keys(%dict_occurence)) {
    my @spl = split(',', $k);

    if ($dict_coeffs{$spl[1]}) {
        ++$dict_coeffs{$spl[1]};
    } else {
        $dict_coeffs{$spl[1]} = 1;
    }

    $dict_files{$spl[0]} = 1;
}

# dict_coeffs :
#
# physique 2
# test 1

$n = keys %dict_files;

foreach my $k (keys(%dict_coeffs)) {
    $dict_coeffs{$k} = log10($n / $dict_coeffs{$k});
}

# dict_coeffs :
#
# physique log10(n / 2)
# test log10(n / 1)

foreach my $k (keys(%dict_occurence)) {
    my @spl = split(',', $k);
    $filename = $spl[0];
    $word = $spl[1];
    $dict_occurence{$filename.','.$word} = $dict_occurence{$k} * $dict_coeffs{$word};
}

# dict_occurence :
#
# 67068.htm,physique  3 * log10(n / 2)
# 67068.htm,test  1 * log10(n / 1)
# 67069.htm,physique  2 * log10(n / 2)

my $dict_words = ();
my $dict_words_count = ();

foreach my $k (sort { $dict_occurence{$a} <=> $dict_occurence{$b} } keys %dict_occurence) {
    my @spl = split(',', $k);
    $dict_words{$spl[1]} = $dict_words{$spl[1]} + $dict_occurence{$k};
    if ($dict_words_count{$spl[1]}) {
        ++$dict_words_count{$spl[1]};
    } else {
        $dict_words_count{$spl[1]} = 1;
    }
}

foreach my $k (keys %dict_words) {
    $dict_words{$k} = $dict_words{$k} / $dict_words_count{$k};
}

foreach my $k (sort { $dict_words{$a} <=> $dict_words{$b} } keys %dict_words) {
    print "$k\t$dict_words{$k}\n";
}
