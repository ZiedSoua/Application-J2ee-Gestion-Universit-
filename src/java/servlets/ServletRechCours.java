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
@WebServlet(name = "ServletRechCours", urlPatterns = {"/ServletRechCours"})
public class ServletRechCours extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException
    {
        System.out.print("servcorech");
        String motcle =req.getParameter("motcle");
        Vector lcours = new Vector();
        IGestionCours gc = new GestionCours();
        lcours=gc.recherchercours(motcle);
        req.setAttribute("listec",lcours);
        getServletContext().getRequestDispatcher("/resRechcours.jsp").forward(req,rep);
    }
}
