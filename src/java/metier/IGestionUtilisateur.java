/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Zied
 */
public interface IGestionUtilisateur {
     
    public void inscrire(Client c);
    public Hashtable validate(Client c);
    public Client authentifier(String login ,String password,String type);
    public Vector rechercheretud(String mot);

}
