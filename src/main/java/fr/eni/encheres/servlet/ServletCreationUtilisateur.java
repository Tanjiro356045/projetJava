package fr.eni.encheres.servlet;

import java.io.IOException;

import fr.eni.echeres.bll.ManagerUtilisateur;
import fr.eni.encheres.exception.BusinessException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUtilisateur
 */
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
		try {
			creationUtilisateur("TLM", "Guillo", "Bastien", "bastien.guillo@gmail.com", "0621068834", "27B square du berry", "35000", "Rennes", "Prout", 100, true);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void creationUtilisateur(String pseudo, String nom, String prenom, String email, String noTelephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur)
			throws BusinessException {
		
		ManagerUtilisateur mngr = new ManagerUtilisateur();
		
		mngr.creationUtilisateur(pseudo, nom,  prenom, email,  noTelephone,
				rue, codePostal, ville, motDePasse, credit, administrateur);
	}

}
