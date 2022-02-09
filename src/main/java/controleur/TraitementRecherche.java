/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modele.Formation;
import modele.Recherche;

/**
 *
 * @author pc
 */
public class TraitementRecherche extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dest = "";
//        String nom = request.getParameter("nom");
//        String langage = request.getParameter("langage");

        Recherche recherche = new Recherche();

        recherche.setNom(request.getParameter("nom"));
        recherche.setLangage(request.getParameter("langage").toUpperCase());
        request.setAttribute("recherche", recherche);

        HttpSession session = request.getSession();

        session.setAttribute("nom", recherche.getNom());

        List maListe = new ArrayList();
        Formation form = new Formation(1, "Java", "Montreal");
        maListe.add(form);

        form = new Formation(2, "Struts", "Laval");
        maListe.add(form);

        form = new Formation(3, "CSS", "Montreal");
        maListe.add(form);

        form = new Formation(4, "HTML", "Quebec");
        maListe.add(form);

        form = new Formation(5, "Java", "Quebec");
        maListe.add(form);

        form = new Formation(6, "HTML", "Montreal");
        maListe.add(form);

        

        List ListeDispo = new ArrayList();
//    get a liste of available formation  de la liste maListe qui egale langage dans recherche

        for (int i = 0; i < maListe.size(); i++) {
            Formation formation = (Formation) maListe.get(i);
            if (formation.getFormation().equals(recherche.getLangage())) {
                ListeDispo.add(formation);
            }
        }
request.setAttribute("ListeDispo", ListeDispo);
        
// verifie si la liste ListeDispo est vide
        if (ListeDispo.isEmpty()) {
            dest = "/formationindisponible.jsp";
            request.setAttribute("message", "Aucune formation trouvée");
        } else {
            dest = "/formationretrouvee.jsp";
            request.setAttribute("message", "Formations trouvées");
        }

      

     

        RequestDispatcher disp = getServletContext().getRequestDispatcher(dest);
        disp.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
