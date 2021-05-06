package conexaobd;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBD {
	private static Connection conn = null;
	private static final String DRIVER_CLASS = "org.hsqldb.JDBCDriver";

	private static String user = "SA";
	private static String senha = "";
	private static String PathBase = "C:\\Curso Desenvolvedor HTML\\PROJETO\\SERVIDOR";
	private static String URL = "jdbc:hsqldb:file:" + PathBase + ";";

	public static Connection conectar() {
		if (conn == null) {
			try {
				Class.forName(DRIVER_CLASS);
				conn = DriverManager.getConnection(URL, user, senha);
			} catch (ClassNotFoundException e) {
				System.out.println("class not found");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Sql");
				e.printStackTrace();
			}
		}
		return conn;
	}
}
*/



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBD {

	private static String usuario = "SA";
	private static String senha = "";
	private static String PathBase = "C:\\Curso Desenvolvedor HTML\\PROJETO\\SERVIDOR\\base";
	private static String URL = "jdbc:hsqldb:file:" + PathBase + ";";

	public static Connection conectar() {
		try {
			return DriverManager.getConnection(URL, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Sql");
			throw new RuntimeException();
		}
	}

}