package fr.eni.encheres.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dao.UtilisateurDAO;
import fr.eni.encheres.exception.BusinessException;

@WebServlet("/pageProfil")
/**
 * Servlet implementation class ServletAfficherProfil
 */
public class ServletAfficherProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAfficherProfil() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		HttpSession session = request.getSession();

		int userId = (int) session.getAttribute("no_utilisateur");
		
		System.out.println("id : " + userId);

		ManagerUtilisateur managerUtilisateur = new ManagerUtilisateur();

		try {

			Utilisateur user = managerUtilisateur.getUtilisateurById(userId);
			System.out.println(managerUtilisateur.getUtilisateurById(userId));
			request.setAttribute("user", user);

			request.getRequestDispatcher("/WEB-INF/jsp/pageProfil.jsp").forward(request, response);

		} catch (BusinessException e) {

			// TODO Auto-generated catch block

			System.out.println(e.toString());

		}

		System.out.println(userId);

	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * 
	 *      response)
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/jsp/pageProfil.jsp").forward(request, response);

	}

//	protected Utilisateur afficherProfilUtilisateur(int noUtilisateur) throws BusinessException {
//
//		ManagerUtilisateur mngr = new ManagerUtilisateur();
//
//		return mngr.getUtilisateurById(noUtilisateur);
//
//	}

}