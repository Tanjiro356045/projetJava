package fr.eni.encheres.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import fr.eni.encheres.bll.ManagerArticleVendu;
import fr.eni.encheres.bll.ManagerCategorie;
import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;

/**
 * Servlet implementation class testArticleServlet
 */
public class testArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public testArticleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ManagerCategorie mgCategorie = new ManagerCategorie();
			Categorie cat = mgCategorie.ajoutCategorie("testcategorie");


			System.out.println(cat);

			ManagerUtilisateur mgtUtilisateur = new ManagerUtilisateur();

			Utilisateur user = mgtUtilisateur.afficherProfilUtilisateur(1);
			System.out.println(user);
			if (cat != null) {

				ArticleVendu article = new ArticleVendu();
				article.setNomArticle("testmardi");
				article.setDescription("description mardi");
				article.setDateDebutEncheres(LocalDate.parse("2022-12-01"));
				article.setDateFinEncheres(LocalDate.parse("2023-05-06"));
				article.setMiseAPrix(100);
				article.setPrixVente(250);
				article.setUtilisateur(user);
				article.setCategorie(cat);

				ManagerArticleVendu mgtArticle = new ManagerArticleVendu();
				mgtArticle.ajoutArticle(article);
			}

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

}
