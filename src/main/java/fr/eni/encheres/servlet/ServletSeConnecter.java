package fr.eni.encheres.servlet;

import java.io.IOException;
import java.sql.SQLException;

import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		String identifiant = request.getParameter("pseudo");

		String mdp = request.getParameter("mdp");

		HttpSession session = request.getSession();

		ManagerUtilisateur mngr = new ManagerUtilisateur();

		


		try {

			Utilisateur utilisateur = mngr.getUtilisateurByPseudoAndPassword(identifiant, mdp);

			if (utilisateur != null) {


				System.out.println("user " + utilisateur.getNoUtilisateur());

				// Met un id d'utilisateur dans le contexte de session

				session.setAttribute("no_utilisateur", utilisateur.getNoUtilisateur());
				// récupérer l'id dans un contexte de session

				// session.getAttribute("no_utilisateur")

				RequestDispatcher rd = request.getRequestDispatcher("/accueilConnecter");

				rd.forward(request, response);

			} else {

				RequestDispatcher rd = request.getRequestDispatcher("/createLogin");

				rd.forward(request, response);

			}

		} catch (BusinessException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}