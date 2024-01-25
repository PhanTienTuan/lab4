package devmaster.edu.vn.conn;

import java.sql.*;

public class ConnectionUtils {
	public static Connection getMySQLConnection()
		throws SQLException,
ClassNotFoundException {
		String hostName = "localhost";
		String dbName = "Lab04JspServletJDBC";
		String userName = "sa";
		String password = "tuan2003";
		String connectionURL = "jdbc:mysql://" + hostName +
				":1443/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}