# Search Engine

## Avancement

- [x] vouloir article parler hexe
- [x] vouloir article parler hexa et titi
- [x] vouloir article parler hexa et titi et datant 2019
- [x] vouloir article parler hexa et titi et datant 20/03/2019
- [x] qui parler hexa (et titi et datant 2019)
- [x] vouloir auteur et article parler hexa
- [x] conjonction AND, OR
- [x] changer ref à article en ref à fichier
- [x] mois et jour à mettre en string et non pas int coté grammaire
- [x] jointures
- [x] gérer "quel articles de la rubrique machin"
- [x] gérer "combien"
- [x] générer la requête SQL
- [x] parser dans le post-traitement les dates "complète" : 01/01/2012
- [x] entre, avant, après
- [x] à partir de (>=), avant (<), après (>)
- [x] tester requête inner join à trois tables.
- [x] gros refacto du projet avant passage au webserver
- [x] serveur web fonctionnel
- [x] ajouter distinct (les différent)
- [x] gérer la distinction entre titre et texte => gérer bonne table.mot
- [x] application web avec moteur de recherche
- [ ] gérer email
- [ ] pas réussi à traiter la recherche de termes réservés avec les flags qu'on a
- [ ] checker que les mots composés fonctionnent (genre jean-marie).
- [ ] ajouter NOT (pas, sans)
- [ ] ajouter choix multiples quand plusieurs lemmes candidats sur l'UI web.
- [ ] gérer case sensitive pour rubrique ("Focus" en table et "focus" lorsque lemmatisé)

## Structure

Le projet est divisé actuellement en deux packages Java :
- `com.lo17.speller`
- `com.lo17.syntaxer`
- `com.lo17.cli`

Ceux-ci représentent les deux étapes de la transformation de la requête. Le package `speller` s'occupe de simplifier la 
requête en langage naturel pour que celle-ci soit assimilable à des concepts SQL et que les mots recherchés correspondent
à des lemmes du corpus. 

Le package `syntaxer` s'occupe d'analyser la requête simplifiée à l'aide d'une grammaire ANTLR et génère la requête SQL
correspondante.

Le package `cli` permet de faire tourner l'application via la ligne de commande. À partir d'une requête utilisateur, 
toute la chaine de traitement est effectuée et elle renvoie le résultat de la recherche.

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
