package fr.eni.encheres.servlet;

import java.io.IOException;
import java.sql.SQLException;

import fr.eni.encheres.bll.ManagerUtilisateur;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
/**
 * Servlet implementation class ServletSeConnecter
 */
public class ServletSeConnecter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSeConnecter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

        dispatcher.forward(request, response);

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String identifiant = request.getParameter("pseudo");
        String mdp = request.getParameter("mot_de_passe");

        ManagerUtilisateur log = new ManagerUtilisateur();
        boolean verif;

        try {
            verif = log.verifIdentifiants(identifiant, mdp);
            if(verif) {
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecter.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/createLogin.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
