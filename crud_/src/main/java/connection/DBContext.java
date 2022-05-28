package connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
	

	public  Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://"+serverName+":"+portNumber+";database="+dbName;
			return DriverManager.getConnection(url, userID, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		DBContext dbcontext = new DBContext();
		try {
			System.out.println(dbcontext.getConnection());
			System.out.println("thành công");
		} catch (Exception e) {
			System.out.println("thất bại");
		}
	}
	
	
	private  static final String serverName="VINHBINH\\SQLSEVER";
	private  static final String portNumber="1433";
	private  static final String instance="";
	private  static final String dbName="stdmanager";
	private  static final String userID="sa";
	private  static final String password="123456";
	
	
}
