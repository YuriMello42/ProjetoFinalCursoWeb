package Servlet;
import java.io.Console;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Classes.cUsuario;
import DAO.LoginDAO;
import DAO.cUsuarioDAO;
import conexaobd.ConnectionFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
private LoginDAO login;
   
    public ServletLogin() {
       
    }

    public void init() {
    	login = new LoginDAO();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("iUsuario");
		String senha = request.getParameter("iSenha");
		
		cUsuario user = new cUsuario();
		user.setEmail(email);
		user.setSenha(senha);
		
		try {
			if(login.validate(user)) {
				response.sendRedirect("Cadastro.jsp");
			}else {
				HttpSession session = request.getSession();
			}
		} catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	}

}
