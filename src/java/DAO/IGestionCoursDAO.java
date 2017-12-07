/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.Vector;
import metier.Cours;

/**
 *
 * @author Zied
 */
public interface IGestionCoursDAO {
    public void Ajoutcours(Cours c);
    public void Supprimercours(Cours c);
    public Vector recherchercours(String mot);
    
}
