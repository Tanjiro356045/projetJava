package fr.eni.encheres.servlet;

import java.io.IOException;
import java.time.LocalDate;

import fr.eni.echeres.bll.ManagerArticleVendu;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dao.CategorieDAO;
import fr.eni.encheres.exception.BusinessException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCreationArticle
 */
@WebServlet("/ajoutArticle")
public class ServletCreationArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/creationArticle.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		HttpSession session = request.getSession();
		ArticleVendu article = new ArticleVendu();
		
		Utilisateur user = new Utilisateur(3,"Pseudo", "Testnom", "Testprenom", "test@gmail.com", "0602020202", "1 rue des fleurs", "35000", "Rennes", "password", 200, true);	
		
		Categorie cat = new Categorie();
		cat.setNoCategorie(1);
		cat.setLibelle("categorietest");
		
		String nomArticle = request.getParameter("article");
		String description = request.getParameter("description");
		LocalDate dateDebutEncheres = LocalDate.parse(request.getParameter("dateDebut"));
		LocalDate dateFinEncheres = LocalDate.parse(request.getParameter("dateFin"));
		int prixInitial = Integer.parseInt(request.getParameter("prixInitial"));
		int prixVente = Integer.parseInt(request.getParameter("prixVente"));
		int idUtilisateur = Integer.parseInt(request.getParameter("categorie"));		
		int idCategorie = Integer.parseInt(request.getParameter("categorie"));						
		
		article.setNomArticle(nomArticle);
		article.setDescription(description);
		article.setDateDebutEncheres(dateDebutEncheres);
		article.setDateFinEncheres(dateDebutEncheres);
		article.setMiseAPrix(prixInitial);
		article.setPrixVente(prixVente);
		article.setUtilisateur(user.getNoUtilisateur());
		article.setCategorie(cat);
		
		System.out.println("Test article : " + nomArticle + " " + description + " " + prixInitial);
		
		ManagerArticleVendu mgr = new ManagerArticleVendu();
		try {
			mgr.ajoutArticle(article);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
