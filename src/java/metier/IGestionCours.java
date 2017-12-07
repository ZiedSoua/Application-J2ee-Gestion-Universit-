/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Zied
 */
public interface IGestionCours {
    public void Ajoutcours(Cours c);
    public void Supprimercours(Cours c);
    public Vector recherchercours(String mot);
    
}
