package fr.eni.encheres.servlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/accueilDeconnecter")
public class ServletAccueilDeconnecter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAccueilDeconnecter() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("UtilisateurConnecter");
		session.invalidate();

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accueilDeconnecter.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
