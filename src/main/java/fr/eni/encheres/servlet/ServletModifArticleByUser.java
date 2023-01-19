package fr.eni.encheres.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import fr.eni.encheres.bll.ManagerArticleVendu;
import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletModifArticleByUser
 */
@WebServlet("/modifArticleByUser")
public class ServletModifArticleByUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModifArticleByUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ManagerArticleVendu mgArticle = new ManagerArticleVendu();
		ManagerUtilisateur managerUtilisateur = new ManagerUtilisateur();
		
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("no_utilisateur");
		
		try {
			List<ArticleVendu> listeArticlesByUser = mgArticle.getListeArticlesByUser(userId);
			System.out.println(listeArticlesByUser);
			request.setAttribute("listeArticles", listeArticlesByUser);
			
			Utilisateur user = managerUtilisateur.getUtilisateurById(userId);
			request.setAttribute("user", user);
		} catch (BusinessException e) {
			System.out.println("Echec remontée liste d'articles par utilisateur - selectByUser");
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/modifArticle.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
