package fr.universite.ws;

import fr.universite.ws.implementation.ServiceCommunicationImpl;
import fr.universite.ws.securite.GestionnaireAuthentification;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;

import java.util.HashMap;
import java.util.Map;

public class ServeurSecurise {
    public static void main(String[] args) {
        Map<String, Object> proprietesSecurite = new HashMap<>();
        proprietesSecurite.put("action", "UsernameToken");
        proprietesSecurite.put("passwordType", "PasswordDigest");
        proprietesSecurite.put("passwordCallbackRef",
                new GestionnaireAuthentification(Map.of("etudiant", "motdepasse123")));

        WSS4JInInterceptor intercepteurSecurite = new WSS4JInInterceptor(proprietesSecurite);

        JaxWsServerFactoryBean fabrique = new JaxWsServerFactoryBean();
        fabrique.setServiceClass(ServiceCommunicationImpl.class);
        fabrique.setAddress("http://localhost:9090/services/communication-securisee");

        Server serveur = fabrique.create();
        serveur.getEndpoint().getInInterceptors().add(intercepteurSecurite);

        System.out.println("Service sécurisé démarré - WSDL : http://localhost:9090/services/communication-securisee?wsdl");
    }
}