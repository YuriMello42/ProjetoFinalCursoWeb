package Servlet;
import java.io.Console;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import Classes.cUsuario;
import DAO.cUsuarioDAO;
import conexaobd.ConnectionFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ServletCadastro
 */
@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletCadastro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("inputNome");
		String email = request.getParameter("inputEmail");
		String senha = request.getParameter("inputSenha");
		String ddd = request.getParameter("inputDDD");
		String telefone = request.getParameter("inputTelefone"); 
		
		String numero = ddd + telefone;
	
		
		
		cUsuario user = new cUsuario(nome,email,senha);
		
		
	
		response.sendRedirect("Cadastro.jsp");
		
		
	
	}

}
