# Traitement de la requête.

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
