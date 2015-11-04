package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

		public Connection getConnection() throws ClassNotFoundException {
		System.out.print("Conectando ao banco... ");
		try {
		    Class.forName("com.mysql.jdbc.Driver"); 
		    return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	}
}