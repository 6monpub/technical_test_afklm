# TECHNICAL TEST
* Ceci est la documentation du test technique 


## BASE DE DONNEES EMBARQUEE
* accés via la console :
  * http://localhost:8080/atos/h2-console
      * Driver class : org.h2.Driver
      * JBDC URL : jdbc:h2:mem:testdb
      * User name : sa
      * Password : 
* Pour persiter les données, voir dans application.properties, la propriété :
  * spring.datasource.url

## BUILD et EXECUTION
* mvn clean install package
* java -jar application-2.5.'-exec.jar

## TEST
* création user OK
  * curl -X POST -H "Content-Type: application/json" -d '{"name": "lemaire","birthday":"2000-09-11","country":"france","phoneNumber":"9877763","gender": "O"}' http://localhost:8080/atos/users/
* consultation user :
  * curl -X GET "http://localhost:8080/atos/users/1"
* création user KO  car mineur
  * curl -X POST -H "Content-Type: application/json" -d '{"name": "lemaire","birthday":"2010-09-11","country":"france","phoneNumber":"9877763","gender": "O"}' http://localhost:8080/atos/users/
