#!/usr/bin/perl

use Encode;

binmode(STDOUT, ":utf8");

while(<>) {
	chop;
	($successeurs,$mot) = split(/\t/);
	$limite="2";
 	while ($successeurs =~ /(...*1)([$limite-9])/) {
		$successeurs=$1.$2;
        if ($2 >= 9) {
            # si on trouve un maximum à 9 précédé d'un 1, inutile d'aller chercher plus loin
            last;
        }
        else {
		  $limite=$2+1;
        }
	}
	$res = substr($mot, 0, length($successeurs));
	print decode 'utf8', $mot."\t";
	print decode 'utf8', $res."\n";
}
