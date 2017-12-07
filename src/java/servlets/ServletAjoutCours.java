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
@WebServlet(name = "ServletAjoutCours", urlPatterns = {"/ServletAjoutCours"})
public class ServletAjoutCours extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException
    {
        System.out.print("servcorsa");
        String idc =req.getParameter("idc");
        String nomc  =req.getParameter("nomc");
        Cours cours = new Cours(idc,nomc);
        IGestionCours gc = new GestionCours();
        gc.Ajoutcours(cours);
        req.setAttribute("nomc",nomc);
        req.setAttribute("idc",idc);
        getServletContext().getRequestDispatcher("/Ajoutcr.jsp").forward(req,rep);
        
    }
}