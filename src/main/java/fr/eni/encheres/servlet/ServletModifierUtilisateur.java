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
import jakarta.servlet.http.HttpSession;

@WebServlet("/modifierProfil")
/**
 * Servlet implementation class ServletModifierUtilisateur
 */
public class ServletModifierUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletModifierUtilisateur() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//<td><a class="lienDetail" href="<%=request.getContextPath()%>/ServletModifierUtilisateur?detail=<%=utilisateur.getIdentifiant()%>&<%=dateFiltre%>">détail</a></td>
		
		//request.getParameter("detail") => id de ton utilisateur
		
		//récupérer les infos de l'utilisateur
		// faire un setAttribute
		//affiche la page de modification
		HttpSession session = request.getSession();

		int userId = (int) session.getAttribute("no_utilisateur");
		
		System.out.println("id : " + userId);

		ManagerUtilisateur managerUtilisateur = new ManagerUtilisateur();

		try {

			Utilisateur user = managerUtilisateur.getUtilisateurById(userId);
			System.out.println(managerUtilisateur.getUtilisateurById(userId));
			request.setAttribute("user", user);

			request.getRequestDispatcher("/WEB-INF/jsp/modifierProfil.jsp").forward(request, response);

		} catch (BusinessException e) {

			// TODO Auto-generated catch block
			
		

			System.out.println(e.toString());

		}

		System.out.println(userId);

	}

		
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

			HttpSession session = request.getSession();

			int userId = (int) session.getAttribute("no_utilisateur");

			try {
				
			ManagerUtilisateur managerUtilisateur = new ManagerUtilisateur();

			Utilisateur user = managerUtilisateur.getUtilisateurById(userId);

			user.setNom(request.getParameter("nom"));
			user.setPrenom(request.getParameter("prenom"));
			user.setEmail(request.getParameter("email"));
			user.setNoTelephone(request.getParameter("no_telephone"));
			user.setRue(request.getParameter("rue"));
			user.setCodePostal(request.getParameter("code_postal"));
			user.setVille(request.getParameter("ville"));
			user.setMotDePasse(request.getParameter("password"));

			managerUtilisateur.modifierUtilisateur(user.getPseudo(), user.getNom(), user.getPrenom(), user.getEmail(),
			user.getNoTelephone(), user.getRue(), user.getCodePostal(), user.getVille(), user.getMotDePasse(),
			user.getCredit(), user.isAdministrateur(), user.getNoUtilisateur());
			
			session.setAttribute("user", user);

			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnecter.jsp");

			rd.forward(request, response);

			} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			}

			}
	
	
//	protected void modifierUtilisateur(String pseudo, String nom, String prenom, String email, String noTelephone, String rue,
//			String codePostal, String ville, String motDePasse, int credit, boolean administrateur, int noUtilisateur)
//					throws BusinessException {
//
//		ManagerUtilisateur mngr = new ManagerUtilisateur();
//
//		mngr.modifierUtilisateur(pseudo, nom,  prenom, email,  noTelephone,
//				rue, codePostal, ville, motDePasse, credit, administrateur, noUtilisateur);
//	}

}
