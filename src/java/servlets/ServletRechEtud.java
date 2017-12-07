/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
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
@WebServlet(name = "ServletRechEtud", urlPatterns = {"/ServletRechEtud"})
public class ServletRechEtud extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException
    {
        System.out.print("servEtudrech");
        String motcle =req.getParameter("motcle");
        Vector letud = new Vector();
        IGestionUtilisateur u = new GestionUtilisateur();
        letud=u.rechercheretud(motcle);
        req.setAttribute("liste",letud);
        getServletContext().getRequestDispatcher("/ListeEtud.jsp").forward(req,rep);
    }
}
