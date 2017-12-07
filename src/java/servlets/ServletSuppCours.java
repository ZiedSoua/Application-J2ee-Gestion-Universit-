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
import metier.*;


/**
 *
 * @author Zied
 */
@WebServlet(name = "ServletSuppCours", urlPatterns = {"/ServletSuppCours"})
public class ServletSuppCours extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException
    {
        System.out.print("servcsupp");
        String idc =req.getParameter("idc");
        String nomc  =req.getParameter("nomc");
        Cours cours = new Cours(idc,nomc);
        IGestionCours gc = new GestionCours();
        gc.Supprimercours(cours);
        req.setAttribute("nomc",nomc);
        req.setAttribute("idc",idc);
        getServletContext().getRequestDispatcher("/Suppcr.jsp").forward(req,rep);
    }
   
}
