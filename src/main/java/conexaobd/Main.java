package conexaobd;

import java.sql.Connection;
import java.sql.SQLException;

import Classes.cUsuario;
import DAO.cUsuarioDAO;

public class Main {

	public static void main(String[] args) {

		Connection c = conexaoBD.conectar();

		if (c == null) {
			System.out.println("Nao Conectou!");
		} else {
			System.out.println("Conectou!");
		}

	}

}
