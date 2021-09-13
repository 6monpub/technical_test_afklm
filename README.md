# TECHNICAL TEST
* Ceci est la documentation du test technique 


## BASE DE DONNEES EMBARQUEE
. La base de données est créé au démarrage  (utilisation de Liquibase)
. Une base de données embarquées est utilisées (voir les paramêtres spring.datasource.*** )
* accés à la base via la console :
  * http://localhost:8080/atos/h2-console
      * Driver class : org.h2.Driver
      * JBDC URL : jdbc:h2:mem:testdb
        * (à modifier si vous voulez que les données soient persistentes)
      * User name : sa
      * Password : 
* Pour persiter les données, voir dans application.properties, la propriété :
  * spring.datasource.url

## BUILD et EXECUTION
* mvn clean install package
* java -jar application-2.5.-exec.jar

## REQUETE TEST
* création user OK
  * curl -X POST -H "Content-Type: application/json" -d '{"name": "lemaire","birthday":"2000-09-11","country":"france","phoneNumber":"9877763","gender": "O"}' http://localhost:8080/atos/users/
* consultation user :
  * curl -X GET "http://localhost:8080/atos/users/1"
* création user KO  car mineur
  * curl -X POST -H "Content-Type: application/json" -d '{"name": "lemaire","birthday":"2010-09-11","country":"france","phoneNumber":"9877763","gender": "O"}' http://localhost:8080/atos/users/

## COMMENTAIRE
* Evolution envisagée :
  * implétation de Swagger pour fournir la description de l'API
  * implémentation de Hateoas qui permet au client de découvrir les actions qu'il peut entreprendre dans la réponse d'une requête
