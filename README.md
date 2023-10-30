# Spring_boot_java
./mvnw spring-boot:run --quiet
pour démarrer une application Spring Boot en utilisant Maven. 

./mvnw : Cela exécute le Maven Wrapper (mvnw sur Windows, mvnw.cmd), qui est un script shell ou batch qui permet d'exécuter Maven sans avoir à l'installer séparément.

spring-boot:run : C'est une des "goals" de Maven spécifique à Spring Boot. Cette tâche démarre l'application Spring Boot.

--quiet : Cela indique à Maven d'exécuter en mode silencieux, ce qui signifie qu'il ne produira que les messages d'erreur et de succès, et ne montrera pas les détails de la compilation et de l'exécution.
    
Assurez-vous d'être dans le répertoire racine de votre projet où se trouve le fichier pom.xml, puis exécutez la commande.

DEMO:
Ouvrez votre navigateur et dans la barre d'adresse en haut, saisissez http://localhost:8080/hello
essayez avec ?name=Amy

SERVICE:
http://localhost:8080/greeting
or
http://localhost:8080/greeting?name=User
