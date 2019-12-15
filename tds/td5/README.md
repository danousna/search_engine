# Requête langage naturel => langage simplifié

## Déroulé

On veut transformer :
`je veux les fichiers qui parlent de xyzhte`

En la forme suivante :
`vouloir article mot xyzt`

Les remplacements effectués :
```
je => ''
les => ''
qui => ''
de => ''
veux => 'vouloir'
fichiers => 'article'
parlent => 'mot'
xyzhte => 'xyzt'
```

À partir du correcteur crée lors du TD3, nous pouvons constituer 3 listes :
- liste de structure : `veux, donne, affiche => vouloir`, `fichier, fichiers => article`, `parle, parlent => mot`
- stoplist : `je, les, de, qui => ''`
- lexique : `xyzhte => xyzt`

Si l'intersection des 3 listes est vide, on peut tout simplement les combiner. Mais en réalité cela n'a pas l'air d'être souhaitable.
En effet, prenons l'exemple suivant :

lexique.txt :
```
article => article
```
structure.txt :
```
article => fichier
```

Si on combine les deux listes, on est forcément baisé étant donné que soit article sera toujours remplacé par article ce qui n'est souhaitable pour les mots de structure soit il sera toujours remplacé par fichier, ce qui n'est pas souhaitable si l'utilisateur recherche réellement le mot 'article'.

### Problème de cette approche

`je veux les fichiers qui parlent de fichiers`

Si un mot de la liste de structure ou de la stoplist apparait est voulu par l'utilisateur, c'est la marde.

Solutions possibles :
1. Imposer à l'utilisateur de mettre des guillemets sur les mots de sa recherche.
2. On peut faire l'hypthèse qu'une recherche de mot est toujours précédée par un le mot de structure 'mot' ('parlent', 'traite', etc..). Ainsi, si l'on traite les mots de la requête un à un, il suffit de détecter le mot de structure 'mot' et de considérer la suite comme une association déterminant + variable. Ainsi, dans l'exemple précédent `qui parlent de fichiers`, le mot 'fichiers' n'est pas remplacé. On fait de plus l'hypothèse que l'utilisateur ne cherchera pas de mots contenus dans la stoplist. En effet il y a objectivement peu d'intérêt à chercher "je", "le", "de", etc...

Tenant compte de la 3ème solution, une fois que l'on détecte le mot de structure 'mot', on ne fait pas passer le reste dans la liste de structure cependant on applique la stoplist.
