# La dependance Srping Web

Cette dependance sert au developpement d'applications web. 
Elle permet de creer des applications Web Spring avec une configuration minimale 
en ajoutant toutes les dependances necessaires au projet, comme le serveur Web 
Apache Tomcat.

# La dependance JPA

Cette dependance permet de creer des versions orientees objet des entites de base 
de donnees relationnelle a utiliser dans les applications.

# La dependance Hibernate

Cette dependance permet de simplifier le processus d'interaction avec les bases de 
donnees en etablissant une correspondance entre les tables de la base de donnees 
et les objets java.

# La dependance H2

Cette dependance permet d'avoir une base de donnees rapide et legere qui peut etre 
persistee ou non. Elle est facilement configurable. Elle est pratique pour les tests
d'integration.

# La dependance DevTools

Cette dependance permet une prise en charge du developpement a distance. Elle permet aux 
developpeurs de connecter leur environnement de developpement local a un serveur distant.
Cela permet un developpement et un debogage transparents sur des serveurs distants.

# La dependance Thymeleaf

Cette dependance permet de produire des vues web et fournir un support pour la generation 
de documents HTML, XHTML, JavaScript et CSS.

# Questions
1. Avec quelle partie du code avons-nous paramétré l'url d'appel /greeting ?

@GetMapping("/greeting")

2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?

@GetMapping("/greeting")

3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?

model.addAttribute("nomTemplate", nameGET);
Avec nameGET


# Pour la question 17 

Une nouvelle table ADDRESS est apparue.

Pour expliquer l'apparition de la nouvelle table :


# Pour la question 20

En lancant la requete SELECT * FROM ADDRESS, je vois le contenu de data.sql sous forme d'une table, avec les colonnes CREATION, ID et CONTENT, et deux lignes par colonne.

# Pour la question 22

Pouvez-vous trouver a quoi sert l'annotation @Autowired du code precedent sur internet ?

L'annotation @Autowired permet d'activer l'injection automatique de dependance. Cette annotation peut etre placee sur un constructeur, une methode set ou directement sur un attribut.

Elle permet a Spring d'injecter automatiquement des dependances dans la classe, en evitant ainsi le besoin de configuration manuelle