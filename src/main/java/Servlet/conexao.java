package Servlet;

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

@WebServlet("/conexao")
public class conexao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<cUsuario> ListUser;

	public conexao() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("iUsuario");
		String senha = request.getParameter("iSenha");

		ListUser = cUsuarioDAO.TodosUsuarios();

		for (cUsuario user : ListUser) {
			if (user.getEmail().equals(login) && user.getSenha().equals(senha)) {
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("Cadastro.jsp");
				requestdispatcher.forward(request, response);
			}
		}

	}

}
