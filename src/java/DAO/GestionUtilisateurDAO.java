/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.util.Vector;
import metier.*;

/**
 *
 * @author Zied
 */
public class GestionUtilisateurDAO implements IGestionUtilisateurDAO  {
    
    public GestionUtilisateurDAO(){}
    public void inscrire(Client c) {
        
    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con ;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/basetp2","zied","insat");
        Statement st =con.createStatement();
        String ch="INSERT INTO INSCRIT(pseudo,nom,prenom,password,email,tel,adresse,type) values ('"+c.getLogin()+"','"+c.getNom()+"','"+c.getPrenom()+"','"+c.getPassword()+"','"+c.getEmail()+"',"+c.getTelephone()+",'"+c.getAdresse()+"','"+c.getType()+"')" ;
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
    public Client authentifier(String login ,String password,String type)
    {
        Client u = null;
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con ;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/basetp2","zied","insat");
        Statement st=con.createStatement();
        String ch = "select * from INSCRIT where PSEUDO='"+login+"' AND PASSWORD='"+password+"' AND type='"+type+"'";
        System.out.print(ch+"daoau1");
        ResultSet res= st.executeQuery(ch);
        
        if(res.next())
        {
            
            u = new Client(res.getString("PSEUDO"),res.getString("NOM"),res.getString("PRENOM"),res.getString("PASSWORD"),res.getString("EMAIL"),res.getDouble("TEL"),res.getString("ADRESSE"),res.getString("TYPE"));
            System.out.print("daoau2");
        }
        
        st.close();
        con.close();
        }
    catch (Exception e) 
    {
        e.printStackTrace();
    } 
        return (u);
    }
 public Vector rechercheretud(String mot)
{
    Vector liste = new Vector();
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con ;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/basetp2","zied","insat");
        Statement st =con.createStatement();
        if (mot.isEmpty())
        {
        String ch="select * from INSCRIT where TYPE='etudiant'";
        System.out.print(ch);
        ResultSet res= st.executeQuery(ch);
        while(res.next())
        {
            Client c = new Client(res.getString("PSEUDO"),res.getString("NOM"),res.getString("PRENOM"),res.getString("PASSWORD"),res.getString("EMAIL"),res.getDouble("TEL"),res.getString("ADRESSE"),res.getString("TYPE"));
            liste.add(c);
        }
        st.close();
        con.close();
        }
        else
        {
        String ch="select * from INSCRIT where (PSEUDO='"+mot+"' or NOM='"+mot+"' or PRENOM='"+mot+"' or EMAIL='"+mot+"' or ADRESSE='"+mot+"') AND TYPE='etudiant'";
        System.out.print(ch);
        ResultSet res= st.executeQuery(ch);
        while(res.next())
        {
            Client c= new Client(res.getString("PSEUDO"),res.getString("NOM"),res.getString("PRENOM"),res.getString("PASSWORD"),res.getString("EMAIL"),res.getDouble("TEL"),res.getString("ADRESSE"),res.getString("TYPE"));
            liste.add(c);
        }
        st.close();
        con.close();
        }
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
        return (liste);
    }
}
