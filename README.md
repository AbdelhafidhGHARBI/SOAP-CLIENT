# SOAP-CLIENT
Client Java SOAP consommant un service web à partir d’un WSDL. Utilise JAX-WS pour générer les classes nécessaires, appeler les opérations ajouterReservation, listerReservations et annulerReservation via un proxy SOAP.

# SOAP-CLIENT

Ce projet Java est un client SOAP permettant d'interagir avec un service web de gestion de réservations, généré à partir d’un WSDL via JAX-WS.

## ⚙️ Fonctionnalités principales

- Ajouter une réservation
- Lister les réservations existantes
- Annuler une réservation

## 🔧 Technologies utilisées

- Java 17
- Maven
- JAX-WS RI (`jaxws-ri` 4.0.2)

## 🛠️ Génération des classes à partir du WSDL

1. Dans IntelliJ IDEA :
   - Clic droit sur le package cible
   - Aller dans `Help → Find Action` (`Ctrl+Shift+A`)
   - Rechercher `Generate Java Code from WSDL`
   - URL du WSDL : `http://localhost:8888/ws/reservation?wsdl`
   - Destination : `src/main/java`
   - Package cible : `org.example.client`

> ⚠️ Activez le plugin **Web Services (JAX-WS)** si l’option est absente.

## ▶️ Exemple d’exécution

```java
ReservationService_Service service = new ReservationService_Service();
ReservationService port = service.getReservationServicePort();

XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance()
        .newXMLGregorianCalendar(new GregorianCalendar());

port.ajouterReservation("GHARBI", "ABDELHAFIDH", xmlDate, 5);
port.listerReservations().forEach(...);
port.annulerReservation("GHARBI", "ABDELHAFIDH");


=== Ajout d'une réservation ===
Réservation ajoutée avec succès.

=== Liste des réservations ===
Nom: GHARBI
Prénom: ABDELHAFIDH
Date: 25/05/2025
Nombre de personnes: 5


=== Annulation de la réservation ===
Réservation annulée.


🧩 pom.xml - dépendances

<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-ri</artifactId>
    <version>4.0.2</version>
    <type>pom</type>
</dependency>
