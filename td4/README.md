# Traitement de la requête.

Réalisation du module grammatical à partir d'une requête normalisée.
À partir de cela, on sort une requête SQL ou pseudo SQL si requête complexe (post-traitement plus tard).

AVANCEMENT :
- [x] vouloir article parler hexe
- [x] vouloir article parler hexa et titi
- [x] vouloir article parler hexa et titi et datant 2019
- [x] vouloir article parler hexa et titi et datant 20/03/2019
- [x] qui parler hexa (et titi et datant 2019)
- [x] vouloir auteur et article parler hexa
- [x] conjonction AND, OR
- [x] changer ref à article en ref à fichier
- [x] mois et jour à mettre en string et non pas int coté grammaire
- [ ] tester requête inner join à trois tables.
- [ ] gérer "quel articles écrit par Michel" et "quel articles de la rubrique machin"
- [ ] gérer "combien"
- [ ] générer la requête SQL
- [ ] jointures !!!
- [ ] à partir de, entre, avant

## Initialement : requête en language naturel

```
Je veux les articles qui parlent de hexafluro...
```

Jusqu'à ici on a surtout travaillé la notion de lemmes et de mise en correspondance aux mots (TD3). Exemple avec hexafluor... on a lemmatisé par hexa.

Ce qu'on veux faire, c'est rapprocher cette grammaire française à une grammaire SQL : 

```sql
SELECT fichier from TableTT where mot = 'hexa'
```

Ce que l'on fait dans ce TD, c'est la grammaire SQL. L'étape de transformation du language naturel vers SQL, on sait le faire. On fait une stoplist et des lemmes, donc on peut déjà élimner 'je', 'les', 'qui', 'de' et lemmatiser hexafluor... en 'hexa'.

Pour le reste, on pourra créer une 3ème liste, des mots de structure :

```
veux => vouloir
voudrais => vouloir
affiche => vouloir

article => fichier
fichier => fichier
fichiers => fichier

parle => mot
contient => mot
au sujet de => mot
```

Notre requête devient donc :

```
vouloir fichier mot hexa
```

C'est la requête normalisée. On met ça ensuite dans notre grammaire SQL. 'vouloir' c'est la valeur de lexicalisation de 'SELECT', etc...

La grammaire que l'on va constuire s'appuit sur la requête normalisée.

## Détails sur la méthodologie

La partie grammaire (AntlrWorks), fait la reconnaissance de la syntaxe à partir de la requête normalisée.
La partie application java, fait la génération de l'arbre et donne la requête SQL.

On commence dans l'environnement AntlrWorks.

Arbre :

SELECT

INFO
 
EXPRESSIONS : EXPRESSION (CONJ EXPRESSION)*

EXPRESSION : TABLE VAR (CONJ VAR)*


## Réflexions

### Grammaire initiale donnée

L'arbre construit par la grammaire "est" la requête SQL :

`vouloir article contenir hexa et recherche et datant 2019.`

Sera transformé en :

```
requete:
    select
    article
    from titreresume, date
    where
    mot = 'hexa'
    and
    mot = 'recherche'
    and
    annee = 2019
```

`vouloir article datant 2019 et contenir hexa et recherche.`

```
requete:
    select
    article
    from date
    where
    annee = 2019
    and
    mot = 'hexa'
    and
    mot = 'recherche'
```

Et du coup dans le post-traitement de la requête, on détecte les nom de variables qui correspondent aux tables SQL.

```json
{
    "table_date": ["annee", "mois", "jour"]
}
```

Dans cette démarche, on suppose que chaque colonne d'une table est unique à la table. Or ce n'est pas le cas.
Les tables titre et texte partagent le même nom de variable : 'mot'. De toute façon cette démarche est à chier
car très peu robuste et pas très rigoureuse.

### 1ère Solution

Arbre final souhaité :

`vouloir article contenir hexa et recherche ou titre Jean-Michel et datant 2019.`

```
requete:
    select
    article
    where
    texte
    mot = 'hexa' 
    and
    texte
    mot = 'recherche' 
    or
    titre
    mot = 'Jean-Michel' 
    and
    date
    annee = 2019
```

params:
    param
    (CONJ param)*

param:
    (MOT | DATE ...)
    VAR
    (CONJ
    VAR)*

Cette proposition est plus pertinente, elle relie directement la variable à sa variable. Il nous suffit en post-traitement de choper les tables mentionnées.

Néanmoins, d'un point de vue sémantique, c'est le bordel, les requêtes suivantes :
- `vouloir article datant ta mère`
- `vouloir article contenir janvier 2019`

Sont valides d'un point de vue grammaire mais les requêtes générées renverront pour le 1er exemple, une erreur et la seconde, fera le traitement sur 'janvier 2019' => 'mois=01, annee=2019' ce qui est faut, pusique l'on recherche dans le texte le string 'janvier 2019'.


### 2ème, et on l'espère dernière solution

La reconnaissance de la table est faite vraiment au niveau de la variable.
Le mot indiquant la table ("contenir", "datant", etc...) est détecté par une variable de son type et c'est dans l'abre que l'on créer avec celui-ci que l'on met le nom de la table.

### Traitement de la date

Requetage de date possibles :

2019
janvier 2019
01/01/2019
1er janvier 2019
20 janvier 2019




### Traitement des comparateurs

Qui a écrit un article en 2019 ?

Quel articles contiennet hexa et sont écrit par Michel Machin ?
