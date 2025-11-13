package fr.universite.ws.modele;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Utilisateur")
public class Utilisateur {
    private String identifiant;
    private String nomComplet;
    private int age;

    public Utilisateur() {} // requis par JAXB

    public Utilisateur(String identifiant, String nomComplet, int age) {
        this.identifiant = identifiant;
        this.nomComplet = nomComplet;
        this.age = age;
    }

    @XmlElement(name = "identifiant")
    public String getIdentifiant() { return identifiant; }
    public void setIdentifiant(String identifiant) { this.identifiant = identifiant; }

    @XmlElement(name = "nomComplet")
    public String getNomComplet() { return nomComplet; }
    public void setNomComplet(String nomComplet) { this.nomComplet = nomComplet; }

    @XmlElement(name = "age")
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}