
// < ConnectionProvider.java >
package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
		String user = "bit";
		String pw = "bit";
		
		return DriverManager.getConnection(jdbcUrl, user, pw);
	}
	
}



< JdbcUtil.java >

package jdbc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	
	
	//Connection
	public static void close(Connection conn) {
		
		if(conn!=null) {
			try {
				
				conn.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	//Statement, PreparedStatement
	public static void close(Statement stmt) {
		
		if(stmt!=null) {
			try {
				
				stmt.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	//ResultSet
	public static void close(ResultSet rs) {
		
		if(rs!=null) {
			try {
				
				rs.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
}

