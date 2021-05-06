package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classes.cUsuario;

public class LoginDAO {
	
	private static String usuario = "SA";
	private static String senha = "";
	private static String PathBase = "C:\\Curso Desenvolvedor HTML\\PROJETO\\SERVIDOR\\base";
	private static String URL = "jdbc:hsqldb:file:" + PathBase + ";";
	
	
	public boolean validate(cUsuario user) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("org.hsqldb.jdbc.JDBCDriver");

        try (Connection connection = DriverManager
            .getConnection(URL, usuario, senha);

            
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from usuario_sistema where email = ? and senha = ? ")) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getSenha());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
