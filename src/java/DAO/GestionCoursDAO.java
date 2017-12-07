/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import metier.Cours;

/**
 *
 * @author Zied
 */
public class GestionCoursDAO implements IGestionCoursDAO  {
    public GestionCoursDAO(){}
    public void Ajoutcours(Cours c)
    {
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con ;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/basetp2","zied","insat");
        Statement st =con.createStatement();
        String ch="INSERT INTO COURS(NOM,REFC) values ('"+c.getNom()+"','"+c.getId()+"')" ;
        System.out.print(ch);
        st.executeUpdate(ch);
        st.close();
        con.close();
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
        
    }
    public void Supprimercours(Cours c)
    {
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con ;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/basetp2","zied","insat");
        Statement st =con.createStatement();
        String ch="delete from COURS where nom='"+c.getNom()+"' and REFC='"+c.getId()+"'" ;
        System.out.print(ch);
        st.executeUpdate(ch);
        st.close();
        con.close();
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
    }
    public Vector recherchercours(String mot)
    {
        Vector lcours = new Vector();
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con ;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/basetp2","zied","insat");
        Statement st =con.createStatement();
        if (mot.isEmpty())
        {
        String ch="select * from COURS";
        System.out.print(ch);
        ResultSet res= st.executeQuery(ch);
        while(res.next())
        {
            Cours c = new Cours(res.getString("NOM"),res.getString("REFC"));
            lcours.add(c);
        }
        st.close();
        con.close();
        }
        else
        {
        String ch="select * from COURS where NOM='"+mot+"' or REFC='"+mot+"'";
        System.out.print(ch);
        ResultSet res= st.executeQuery(ch);
        while(res.next())
        {
            Cours c= new Cours(res.getString("NOM"),res.getString("REFC"));
            lcours.add(c);
        }
        st.close();
        con.close();
        }
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
        return (lcours);
    }
    
}
