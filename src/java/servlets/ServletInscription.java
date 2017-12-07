/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.*;

/**
 *
 * @author Zied
 */
@WebServlet(name = "ServletInscription", urlPatterns = {"/ServletInscription"})
public class ServletInscription extends HttpServlet {
    @Override
    public void service(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException
    {
     try
        {
            String iden =req.getParameter("pseudo");
            String mail =req.getParameter("email");
            String nom =req.getParameter("nom");
            String prenom =req.getParameter("prenom");
            String pass =req.getParameter("password");
            String tels = req.getParameter("phone");
            String adr = req.getParameter("adresse");
            String type =req.getParameter("type");
            double tel = Integer.parseInt(tels);
            Client c = new Client(iden,nom,prenom,pass,mail,tel,adr,type);
            IGestionUtilisateur g = new GestionUtilisateur() ;
            Hashtable err= g.validate(c);
            if (err.isEmpty())
            {
            g.inscrire(c);
            req.setAttribute("nom",nom);
            req.setAttribute("prenom",prenom);
            req.setAttribute("login",iden);
            getServletContext().getRequestDispatcher("/suc.jsp").forward(req,rep);
            }   
            else 
            { 
                req.setAttribute("err",err);
                getServletContext().getRequestDispatcher("/errors.jsp").forward(req,rep);
            }
       
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    }

}
