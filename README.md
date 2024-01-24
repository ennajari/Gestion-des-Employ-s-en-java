# Gestion-des-Employ-s-en-java
Ce projet Java propose une application simple pour la gestion des employés dans une entreprise. Il utilise des classes orientées objet pour modéliser différentes catégories d'employés, notamment les ouvriers, les cadres et les patrons.

**Classes Principales**
_Employe (classe abstraite) :_

Caractérisée par des attributs tels que le matricule, le nom, le prénom et la date de naissance.
Dispose d'une méthode abstraite GetSalaire pour le calcul du salaire.
Ouvrier :

_Hérite de la classe Employe._
Ajoute un attribut spécifique pour la date d'entrée à la société.
Implémente la méthode GetSalaire avec une logique de calcul de salaire par défaut.
Cadre :

_Hérite de la classe Employe._
Ajoute un attribut spécifique pour le département.
Implémente la méthode GetSalaire avec une logique de calcul de salaire par défaut.
Patron :

_Hérite de la classe Employe._
Ajoute un attribut spécifique pour le nom de l'entreprise.
Implémente la méthode GetSalaire avec une logique de calcul de salaire par défaut.
Fonctionnalités

Saisie des informations des employés (matricule, nom, prénom, date de naissance, etc.).
Affichage des détails des employés.
Calcul du salaire pour chaque catégorie d'employé avec des valeurs par défaut.

**Comment Utiliser**
Clonez le projet sur votre machine locale : git clone [https://github.com/votre_nom/GestionEmployes.git](https://github.com/ennajari/Gestion-des-Employ-s-en-java/edit/main/README.md)

Compilez les fichiers Java : javac *.java
Exécutez la classe principale : java Principale

N'hésitez pas à contribuer en ajoutant de nouvelles fonctionnalités, des améliorations ou des corrections de bugs. Vos retours sont les bienvenus ! 😊 @Ennajari_Abdellah
