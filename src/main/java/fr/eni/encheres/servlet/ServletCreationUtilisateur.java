package fr.eni.encheres.servlet;

import java.io.IOException;

import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUtilisateur
 */
@WebServlet("/createLogin")

public class ServletCreationUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/WEB-INF/jsp/createLogin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
//  		   creationUtilisateur("TLM", "Guillo", "Bastien", "bastien.guillo@gmail.com", "0621068834", "27B square du berry", "35000", "Rennes", "Prout", 100, true);

			Utilisateur util = creationUtilisateur(request.getParameter("pseudo"),
								request.getParameter("nom"),
								request.getParameter("prenom"),
								request.getParameter("email"),
								request.getParameter("telephone"),
								request.getParameter("adresse"),
								request.getParameter("codepostal"),
								request.getParameter("ville"),
								request.getParameter("password"),
								100, true);
			ManagerUtilisateur mngr = new ManagerUtilisateur();
			
			//mettre ton objet dans la request affiche la bone page

			//request.setAttribute("listeCodesErreur", e.getListeCodesErreur());
			
			// Transfert de l'affichage à la JSP
				//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/affichage.jsp");
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			rd.forward(request, response);
			System.out.println("utilisateur " + util);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected Utilisateur creationUtilisateur(String pseudo, String nom, String prenom, String email, String noTelephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur)
			throws BusinessException {
		
		ManagerUtilisateur mngr = new ManagerUtilisateur();
		
		return mngr.creationUtilisateur(pseudo, nom,  prenom, email,  noTelephone,
				rue, codePostal, ville, motDePasse, credit, administrateur);
	}

}
