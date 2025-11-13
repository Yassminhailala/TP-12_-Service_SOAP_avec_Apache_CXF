package fr.universite.ws.api;

import fr.universite.ws.modele.Utilisateur;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://api.ws.universite.fr/")
public interface ServiceCommunication {

    @WebMethod(operationName = "EnvoyerMessage")
    @WebResult(name = "reponse")
    String envoyerMessage(@WebParam(name = "identifiant") String identifiant);

    @WebMethod(operationName = "RechercherUtilisateur")
    @WebResult(name = "utilisateur")
    Utilisateur rechercherUtilisateur(@WebParam(name = "code") String code);
}