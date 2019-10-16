# LO17

## Présentation

A partir d'un ensemble de page html, on crée un corpus xml avec les différents composants de ces pages html.

Dans ce corpus, certaines des balises sont dites "simples" :
- date
- rubrique
- numéro bulletin
- contact

Elles sont de la forme : `<balise>contenu</balise>`.

D'autres contenus de balises sont néanmoins moins simples à extraire car elles contiennent plusieurs mots :
- titre
- article

Il faut extraire de celles-ci, la liste des mots et les documents correspondants.
Il faut balayer les titres, les articles et les titre + articles afin de pouvoir requêter de la manière suivant :
- je cherche un article dont le titre...
- je cherche un article qui contient ...
- je cherche un article dont le sujet est ... (peut être dans le titre ou article)

Remarques :
- Pour la rubrique, même si elle est composée parfois de plusieurs mots, on la considère comme un seul élèment, c'est donc bien une balise dite simple.
- Extraire l'adresse mail de la balise de contact
- Problème de la segmentation (séparateurs : `. | ; | , | -`)
- Question de l'unité documentaire, quelle granularité

Une fois la stop list faite, on peut re-filtrer le corpus pour enlever les mots non utiles, on pourra ensuite faire la table inverse.

## Workflow

A partir du corpus de fichiers html, le déroulé de la construction de l'index est le suivant :
- `td1/main.pl` : construction du fichier structuré `corpus.xml`
- `td2/segmente.pl` : construction du fichier `segmentation.txt` avec une colonne mot et une colonne fichier html
- `td2/coefficients.pl` : construction du fichier `coefficients.txt` avec trois colonnes : fichier, mot et coefficient tf * idf.
- `td2/stoplist.pl` : construction du fichier `stoplist.txt`, une liste de mots à exclure car leurs coefficients est inférieur à une valeur arbitraire donnée.


## TODO

- Moyenner les coefficients (voir coefficient.pl pour le détail)
- Table inverse pour titre, texte, email auteur, date
- Faire plusieurs tables dans une BDD
- Quand il y a requête, donner le fichier html correspondant le plus proche


## Construction des requêtes

À partir d'une phrase telle que :
`Je veux les articles qui parlent de nanotechnologie dans la rubrique Focus.`

Je veux obtenir la requête SQL suivante :
```sql
SELECT id_article FROM table WHERE text LIKE 'nanotechnologie' AND rubrique == 'focus'
```

Je transforme la requête de la manière suivante :
1. Suppression des mots usuels + minuscules
```
veux articles parlent nanotechnologie rubrique Focus.
```
2. Subsitution par les lemmes
``` 
veu article parl nanotechnologie rubrique focus
```
3. Recherche dans le lexique SQL
```
veu => SELECT
article => id_article
parl => LIKE

SELECT id_article FROM table WHERE text LIKE 'nanotechnologie' AND rubrique == 'focus'
```

## Rapport

=> quel est le pb
=> quel est la solution
=> quel est le résultat
=> choix faits
=> comment on a fait

=> retour critique sur ce qu'on a fait
=> quel évaluation sur ce qu'on a fait
