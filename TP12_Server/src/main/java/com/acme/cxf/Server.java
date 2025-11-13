package fr.universite.ws;

import fr.universite.ws.implementation.ServiceCommunicationImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class ServeurPrincipal {
    public static void main(String[] args) {
        String adresse = "http://localhost:9090/services/communication";

        JaxWsServerFactoryBean fabrique = new JaxWsServerFactoryBean();
        fabrique.setServiceClass(ServiceCommunicationImpl.class);
        fabrique.setAddress(adresse);
        fabrique.create();

        System.out.println("Service démarré - WSDL disponible à : " + adresse + "?wsdl");
    }
}