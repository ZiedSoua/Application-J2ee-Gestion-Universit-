/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import metier.Client;
import metier.GestionUtilisateur;
import metier.IGestionUtilisateur;

/**
 *
 * @author Zied
 */
@WebServlet(name = "ServletAuthentification", urlPatterns = {"/ServletAuthentification"})
public class ServletAuthentification extends HttpServlet {

     public void service(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException
     {
         String iden =req.getParameter("pseudo");
         String pass =req.getParameter("password");
         String type =req.getParameter("type");
         IGestionUtilisateur g =new GestionUtilisateur() ;
         Client c =new Client();
          c=g.authentifier(iden,pass,type);
         if (c != null)
         {
             
             HttpSession s = req.getSession(true);
             s.setAttribute("client",c);
             if (c.getType().equals("etudiant"))
             {
             System.out.print("etudiant"+c.getLogin()+c.getPassword());
             getServletContext().getRequestDispatcher("/authetud.jsp").forward(req,rep);
             }
             else if (c.getType().equals("admin"))
             {
                 System.out.print("admin"+c.getLogin()+c.getPassword());
             getServletContext().getRequestDispatcher("/authadmin.jsp").forward(req,rep);
             }
         }
     }
}
