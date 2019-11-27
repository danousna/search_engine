# Traitement de la requête.

Réalisation du module grammatical à partir d'une requête normalisée.
À partir de cela, on sort une requête SQL ou pseudo SQL si requête complexe (post-traitement plus tard).

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

### Solution

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

