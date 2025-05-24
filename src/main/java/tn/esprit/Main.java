package tn.esprit;

import tn.esprit.client.Reservation;
import tn.esprit.client.ReservationService;
import tn.esprit.client.ReservationService_Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DatatypeConfigurationException {
        // Instanciation du service généré à partir du WSDL
        ReservationService_Service service = new ReservationService_Service();

        // 2Récupération du port (proxy) pour appeler les méthodes SOAP
        ReservationService reservationService = service.getReservationServicePort();

        // Création de l'objet Date (utilisé par ton service)
        Date dateReservation = new Date();
        //Le service SOAP utilise XMLGregorianCalendar pour les dates donc il faut le convertir :
        // Conversion en XMLGregorianCalendar pour SOAP
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.setTime(dateReservation);
        XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);


        //Appel de la méthode "ajouterReservation"
        System.out.println("=== Ajout d'une réservation ===");
        String response = reservationService.ajouterReservation("Doe", "John", xmlDate, 4);
        System.out.println(response);

        //Appel de la méthode "listerReservations"
        System.out.println("\n=== Liste des réservations ===");
        List<Reservation> reservations = reservationService.listerReservations();
        reservations.forEach(res -> {
            System.out.println("Nom: " + res.getNom());
            System.out.println("Prénom: " + res.getPrenom());
            System.out.println("Date: " + res.getDateReservation());
            System.out.println("Nombre de personnes: " + res.getNombrePersonnes());
            System.out.println("----");
        });

        //Appel de la méthode "annulerReservation"
        System.out.println("\n=== Annulation de la réservation ===");
        String annulation = reservationService.annulerReservation("Doe", "John");
        System.out.println(annulation);
    }
}