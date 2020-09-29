Veuillez trouver le travail demandé.

Ce programme fonctionne à partir de Java 8 et plus.

Dans ce package, il y a deux dossiers "source" and "jar-for-test"

- Le dossier "source" contient le code source du projet. C'est un programme fait avec SpringBoot 2.3.4.

Pour l'utiliser, il faut l'importer en tant que projet maven existant à partir de votre IDE.

Ce programme est structuré comme suit :

test.technique.adneom.AdneomApplication qui est la classe principale de l'application

test.technique.adneom.service.impl.AdneomPartition : c'est la classe où est implémentée la fonction "partition" demandée

test.technique.adneom.AdneomApplicationTests : c'est la classe où est écrit les tests unitaires afin de tester l'implémentation

- le dossier "jar-for-test" contient un fichier jar qui permet de tester l'application à partir de votre ms dos

Pour tester l'application à partir d'un ms dos ou d'un terminal linux, 

Vérifier si vous avez au moins un java 8 installé sur votre poste avec cette commande "java - version"

Si oui, placez vous sur le répertoire "jar-for-test" et lancer cette commande :

java -jar adneom-0.0.1-SNAPSHOT.jar  "1,2,3,4,5" 2

"1,2,3,4,5" => correspond à la liste à tester donc argument 1. On peut modifier les valeurs en mettant  par example "rouge, bleu, jaune, orange, vert".
Il suffit juste de séparer les différentes valeurs par un virgule (,). On peut même mélanger des valeurs alphanumériques (exemple "1,2,d,5,f").
Pour une suite de donnée, il faut les délimiter par des entrecotes ""

2 => correspond à la taille donc argument 2. Cette valeur doit être positive et numérique

Certaines controles ont été faites :

Si vous lancer le programme sans les deux paramètres (la liste et la taille), ce message d'erreur va s'afficher "The input parameters are empty"

Si vous lancer le programme avec plus de deux paramètres , ce message d'erreur va s'afficher "The number of input parameters must be 2"

Si vous lancer le programme pour le 2e argument (la taille) comme chaine de caractère, ce va s'afficher "The second input parameter is not a integer value"

Si vous lancer le programme pour le 2e argument (la taille) avec comme valeur 0 ou une valeur négative , ce message d'erreur va s'afficher "The second input parameter must not equal 0 or be negative"

Bon test !!!!




