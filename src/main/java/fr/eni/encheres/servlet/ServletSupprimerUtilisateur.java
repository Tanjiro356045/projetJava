package fr.eni.encheres.servlet;

 

import java.io.IOException;

 

import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.exception.BusinessException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

 


@WebServlet("/supprimerProfil")
/**
* Servlet implementation class ServletSupprimerUtilisateur
*/
public class ServletSupprimerUtilisateur extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSupprimerUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

 

        int userId = (int) session.getAttribute("no_utilisateur");

        System.out.println("userId " + userId);

        try {
            supprimerUtilisateur(userId);
        } catch (BusinessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        response.getWriter().append("Served at: ").append(request.getContextPath());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accueilDeconnecter.jsp");

 

        dispatcher.forward(request, response);
    }

 

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

    protected void supprimerUtilisateur(int noUtilisateur) throws BusinessException {

        ManagerUtilisateur mngr = new ManagerUtilisateur();

        mngr.supprimerUtilisateur(noUtilisateur);
    }
    }

 

