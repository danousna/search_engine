#!/usr/bin/perl

# perl index.pl corpus_lemme.xml > index.txt

$balise = shift(@ARGV);
print STDERR "création d'index pour la balise <$balise>...\n";

while (<>) {
	if (/<fichier>(.*)<\/fichier>/) {
		$fichier="\t".$1;
	} elsif (/<numero>(.+)<\/numero>/) {
		$numero="\t".$1;
    } elsif (/<rubrique>(.*)<\/rubrique>/) {
        $rubrique="\t".$1;
	} elsif (/<$balise>(.*)<\/$balise>/) {
		$index = $1;
	}
	if ($index && $fichier && numero && rubrique) {
        if ($balise eq 'date') {
            @date = split(/\//,$index);
            $jour = shift(@date);
            # print("jour $jour\n");
            $mois = "\t".shift(@date);
            # print("mois $mois\n");
            $annee = "\t".shift(@date);
            # print("annee $annee\n");
            $index=$jour.$mois.$annee
        }
        if ($balise eq 'contact') {
            while ($index =~ /href=\"mailto:([^']*?)\"/g) {
                $tabindex{$1} .= "$rubrique$fichier$numero";
            }
        } else {
            $tabindex{$index} .= "$rubrique$fichier$numero";
        }
    }
	$index="";
}


@cleindex = keys %tabindex ;
foreach $index (@cleindex) {
	print $index.$tabindex{$index}."\n";
    # chop the texte to have the index for each word ?
}

