package fr.eni.encheres.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import fr.eni.encheres.bll.ManagerArticleVendu;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.exception.BusinessException;

/**
 * Servlet implementation class ServletAllArticles
 */
@WebServlet("/allArticles")
public class ServletAllArticles extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAllArticles() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	ManagerArticleVendu mgArticle = new ManagerArticleVendu();
	
		try {
			List<ArticleVendu> listeAllArticles = mgArticle.getListeArticles();
//			System.out.println(mgArticle.getListeArticles());
			request.setAttribute("listeArticles", listeAllArticles);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Redirection vers la jsp
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/allArticles.jsp");
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
