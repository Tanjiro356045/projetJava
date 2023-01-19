package fr.eni.encheres.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/seDeconnecter")
/**
 * Servlet implementation class ServletSeDeconnecter
 */
public class ServletSeDeconnecter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSeDeconnecter() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		int userId = (int) session.getAttribute("no_utilisateur");
		
		System.out.println("Session déco");
		
		session.invalidate();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accueilDeconnecter.jsp");

		dispatcher.forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session = request.getSession();
//
//		int userId = (int) session.getAttribute("no_utilisateur");
//		
//		System.out.println("Session déco");
//		
//		session.invalidate();
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accueilDeconnecter.jsp");
//
//		dispatcher.forward(request, response);
		
		doGet(request, response);
	}

}
