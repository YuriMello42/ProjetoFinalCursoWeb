package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Classes.cUsuario;
import conexaobd.conexaoBD;

public class cUsuarioDAO {
	
	cUsuario user;

	private final String INSERIR_USUARIO = "INSERT INTO USUARIO_SISTEMA(NOME, EMAIL, SENHA) VALUES ( ?, ?, ?);";
	private final String INSERIR_NUMERO_USUARIO = "INSERT INTO TELEFONE()VALUES ();";

	
	
	
	public void inserir(cUsuario user) {
		new conexaoBD();
		try (Connection conn = conexaoBD.conectar(); PreparedStatement pst = conn.prepareStatement(INSERIR_USUARIO);) {
			pst.setString(1, user.getNome());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getSenha());
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao executar o Statment " + e.toString());
		}
		
		try (Connection conn = conexaoBD.conectar(); PreparedStatement pst = conn.prepareStatement("");){
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}


	private final static String SELECIONAR_USUARIO = "SELECT * FROM USUARIOS";

	public static ArrayList<cUsuario> TodosUsuarios() {
		ArrayList<cUsuario> listaDeUsuarios = new ArrayList<cUsuario>();

		cUsuario umUsuario;
		try (Connection conn = new conexaoBD().conectar();
				PreparedStatement pst = conn.prepareStatement(SELECIONAR_USUARIO);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				umUsuario = new cUsuario();
				umUsuario.setId(rs.getInt("ID_USUARIO"));
				umUsuario.setNome(rs.getString("NOME"));
				umUsuario.setEmail(rs.getString("EMAIL"));
				umUsuario.setSenha(rs.getString("SENHA"));

				listaDeUsuarios.add(umUsuario);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao executar o Statement" + e.toString());
		}

		return listaDeUsuarios;
	}


	private final String ALTERAR_USUARIO = "UPDATE USUARIO_SISTEMA SET NOME=?, EMAIL=?, SENHA=? WHERE ID=?;";

	public boolean alterar(cUsuario user) {
		boolean ret = false;
		try (Connection conn = new conexaoBD().conectar();
				PreparedStatement pst = conn.prepareStatement(ALTERAR_USUARIO);
				ResultSet rs = pst.executeQuery();) {
			pst.setString(1, user.getNome());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getSenha());
			pst.setInt(4, user.getId());
			ret = pst.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao executar o Statment " + e.toString());
		}
		return ret;
	}


	private final String DELETAR_USUARIO = "DELETE FROM USUARIO_SISTEMA WHERE ID=?";

	public boolean deletar( int id) {
		boolean ret = false;
		try (Connection conn = new conexaoBD().conectar();
				PreparedStatement pst = conn.prepareStatement(DELETAR_USUARIO);
				ResultSet rs = pst.executeQuery();) {
			pst.setInt(1, user.getId());
			ret = pst.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao executar o Statment " + e.toString());
		}
		return ret;
	}

}
