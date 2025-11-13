package fr.universite.ws.implementation;

import fr.universite.ws.api.ServiceCommunication;
import fr.universite.ws.modele.Utilisateur;
import jakarta.jws.WebService;

@WebService(
        serviceName = "ServiceCommunication",
        portName = "ServiceCommunicationPort",
        endpointInterface = "fr.universite.ws.api.ServiceCommunication",
        targetNamespace = "http://api.ws.universite.fr/"
)
public class ServiceCommunicationImpl implements ServiceCommunication {

    @Override
    public String envoyerMessage(String identifiant) {
        return "Message pour " + (identifiant == null ? "visiteur" : identifiant);
    }

    @Override
    public Utilisateur rechercherUtilisateur(String code) {
        return new Utilisateur(code, "Marie Curie", 38); // données de test
    }
}