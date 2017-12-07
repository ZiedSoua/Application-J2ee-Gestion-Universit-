/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Vector;
import metier.Client;

/**
 *
 * @author Zied
 */
public interface IGestionUtilisateurDAO {
    public void inscrire(Client c);
    public Client authentifier(String login ,String password,String type);
    public Vector rechercheretud(String mot);
}

