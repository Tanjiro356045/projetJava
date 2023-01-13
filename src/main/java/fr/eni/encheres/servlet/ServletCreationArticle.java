package fr.eni.encheres.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fr.eni.echeres.bll.ManagerArticleVendu;
import fr.eni.encheres.bo.ArticleVendu;
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
		// Utilisation du formatter pour insérer correctement dans la BD.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateDebut = LocalDate.parse("2022-10-11", dtf);
		LocalDate dateFin = LocalDate.parse("2022-10-25", dtf);

		ArticleVendu articleTest = new ArticleVendu();
		articleTest.setNomArticle("Article test");
		articleTest.setDescription("Description article test");
//				articleTest.setDateDebutEncheres(dateDebut);
//				articleTest.setDateFinEncheres(dateFin);
		articleTest.setMiseAPrix(850);
		articleTest.setPrixVente(1800);
		articleTest.setNoUtilisateur(1);
		articleTest.setNoCategorie(2);

		ManagerArticleVendu mgr = new ManagerArticleVendu();
		try {
			mgr.ajoutArticle(articleTest);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
