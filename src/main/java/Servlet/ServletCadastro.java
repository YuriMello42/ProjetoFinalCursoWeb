package Servlet;

import java.io.Console;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	private cUsuario user;
    private cUsuarioDAO usuarioDAO;

    public void init() {
        usuarioDAO = new cUsuarioDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/insert":
                    inserirusuario(request, response);
                    break;
                case "/delete":
                    deletarusuario(request, response);
                    break;
                case "/update":
                    alterarusuario(request, response);
                    break;
                default:
                    consultarusuario(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void consultarusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        List < cUsuario > listUser = usuarioDAO.TodosUsuarios();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Cadastro.jsp");
        dispatcher.forward(request, response);
    }


    private void inserirusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        cUsuario newUser = new cUsuario(name, email, senha);
        usuarioDAO.inserir(newUser);
        response.sendRedirect("list");
    }

    private void alterarusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("name");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        cUsuario book = new cUsuario(nome,email,senha);
        usuarioDAO.alterar(book);
        response.sendRedirect("list");
    }

    private void deletarusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        usuarioDAO.deletar(id);
        response.sendRedirect("list");

    }
}