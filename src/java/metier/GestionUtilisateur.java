/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import DAO.*;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Zied
 */
public class GestionUtilisateur implements IGestionUtilisateur  {
    IGestionUtilisateurDAO gd ;
    
    public GestionUtilisateur() {
     gd = new GestionUtilisateurDAO();
    }
    public void inscrire(Client c) {
        gd.inscrire(c);
        System.out.print("cbonins");
    }
    public Hashtable validate(Client c)
    {
        Hashtable h = new Hashtable(8);
        if (c.getLogin().isEmpty()) h.put("login","vide");
        if (c.getPassword().isEmpty()) h.put("mot de passe","vide");
        if (c.getNom().isEmpty()) h.put("nom","vide");
        if (c.getPrenom().isEmpty()) h.put("prenom","vide");
        if (c.getEmail().isEmpty()) h.put("email","vide");
        else if (!c.getEmail().contains("@")) h.put("email","invalide");
        if (c.getAdresse().isEmpty()) h.put("adresse","vide");
        String tels ;
        tels = Double.toString(c.getTelephone());
        if (tels.length()==8) h.put("telephone","format err");
        return h;
    }
    public Client authentifier(String login ,String password,String type)
    {
        Client c = new Client();
        c= gd.authentifier(login ,password,type);
        System.out.print("auth"+login+password);
        return (c);
    }
    
    public Vector rechercheretud(String mot)
    {
        Vector liste = new Vector();
        liste=gd.rechercheretud(mot);
        System.out.print("cbonrechEtud");
        return(liste);
    }
    
}
