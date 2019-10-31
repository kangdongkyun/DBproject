import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection makeConnection() {
		try {
			// load and register
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			String url = protocal://HostName:portNumber; databasesName
			String url = "jdbc:sqlserver://A205-07\\SQLEXPRESS2:1433;databaseName=test01";
			Connection con = DriverManager.getConnection(url, "sa", "1111");
			System.out.println("Connection is established");
			return con;
				
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
