/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Zied
 */
public class Client {
    private String iden ;
    private String nom ;
    private String prenom ;
    private String email ;
    private String pass ;
    private String adr ;
    private double tel ;
    private String type ;
    
    public Client()
    {}
    public Client(String id,String nom,String prenom,String motp,String mail,double num,String adresse,String typ) 
    {
     this.iden=id;this.email=mail;this.pass=motp;this.nom=nom;this.prenom=prenom;this.tel=num;this.adr=adresse;this.type=typ;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adr;
    }

    public String getLogin() {
        return iden;
    }

    public String getPassword() {
        return pass;
    }

    public String getType() {
        return type;
    }

    public double getTelephone() {
        return tel;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adr = adresse;
    }

    public void setLogin(String login) {
        this.iden = login;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTelephone(int telephone) {
        this.tel = telephone;
    }    
}
