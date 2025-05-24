
package tn.esprit.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tn.esprit.client package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AjouterReservation_QNAME = new QName("http://gestionReservation/", "ajouterReservation");
    private static final QName _AjouterReservationResponse_QNAME = new QName("http://gestionReservation/", "ajouterReservationResponse");
    private static final QName _AnnulerReservation_QNAME = new QName("http://gestionReservation/", "annulerReservation");
    private static final QName _AnnulerReservationResponse_QNAME = new QName("http://gestionReservation/", "annulerReservationResponse");
    private static final QName _ListerReservations_QNAME = new QName("http://gestionReservation/", "listerReservations");
    private static final QName _ListerReservationsResponse_QNAME = new QName("http://gestionReservation/", "listerReservationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tn.esprit.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterReservation }
     * 
     * @return
     *     the new instance of {@link AjouterReservation }
     */
    public AjouterReservation createAjouterReservation() {
        return new AjouterReservation();
    }

    /**
     * Create an instance of {@link AjouterReservationResponse }
     * 
     * @return
     *     the new instance of {@link AjouterReservationResponse }
     */
    public AjouterReservationResponse createAjouterReservationResponse() {
        return new AjouterReservationResponse();
    }

    /**
     * Create an instance of {@link AnnulerReservation }
     * 
     * @return
     *     the new instance of {@link AnnulerReservation }
     */
    public AnnulerReservation createAnnulerReservation() {
        return new AnnulerReservation();
    }

    /**
     * Create an instance of {@link AnnulerReservationResponse }
     * 
     * @return
     *     the new instance of {@link AnnulerReservationResponse }
     */
    public AnnulerReservationResponse createAnnulerReservationResponse() {
        return new AnnulerReservationResponse();
    }

    /**
     * Create an instance of {@link ListerReservations }
     * 
     * @return
     *     the new instance of {@link ListerReservations }
     */
    public ListerReservations createListerReservations() {
        return new ListerReservations();
    }

    /**
     * Create an instance of {@link ListerReservationsResponse }
     * 
     * @return
     *     the new instance of {@link ListerReservationsResponse }
     */
    public ListerReservationsResponse createListerReservationsResponse() {
        return new ListerReservationsResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     * @return
     *     the new instance of {@link Reservation }
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjouterReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation/", name = "ajouterReservation")
    public JAXBElement<AjouterReservation> createAjouterReservation(AjouterReservation value) {
        return new JAXBElement<>(_AjouterReservation_QNAME, AjouterReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjouterReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation/", name = "ajouterReservationResponse")
    public JAXBElement<AjouterReservationResponse> createAjouterReservationResponse(AjouterReservationResponse value) {
        return new JAXBElement<>(_AjouterReservationResponse_QNAME, AjouterReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnulerReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation/", name = "annulerReservation")
    public JAXBElement<AnnulerReservation> createAnnulerReservation(AnnulerReservation value) {
        return new JAXBElement<>(_AnnulerReservation_QNAME, AnnulerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnulerReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation/", name = "annulerReservationResponse")
    public JAXBElement<AnnulerReservationResponse> createAnnulerReservationResponse(AnnulerReservationResponse value) {
        return new JAXBElement<>(_AnnulerReservationResponse_QNAME, AnnulerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerReservations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListerReservations }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation/", name = "listerReservations")
    public JAXBElement<ListerReservations> createListerReservations(ListerReservations value) {
        return new JAXBElement<>(_ListerReservations_QNAME, ListerReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerReservationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListerReservationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation/", name = "listerReservationsResponse")
    public JAXBElement<ListerReservationsResponse> createListerReservationsResponse(ListerReservationsResponse value) {
        return new JAXBElement<>(_ListerReservationsResponse_QNAME, ListerReservationsResponse.class, null, value);
    }

}
