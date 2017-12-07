/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;


import DAO.GestionCoursDAO;
import DAO.IGestionCoursDAO;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author Zied
 */
public class GestionCours implements IGestionCours {
     
     IGestionCoursDAO r ;    
    public GestionCours() {
     r = new GestionCoursDAO();
    }
    public void Ajoutcours(Cours c)
    {
        r.Ajoutcours(c);
        System.out.print("cbonajoutc");
    }
    public void Supprimercours(Cours c)
    {
        r.Supprimercours(c);
        System.out.print("cbonsuppc");
    }
    public Vector recherchercours(String mot)
    {
        Vector lcours = new Vector();
        lcours=r.recherchercours(mot);
        System.out.print("cbonrech");
        return(lcours);
    }
    
}
