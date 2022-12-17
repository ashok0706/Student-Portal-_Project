package P1;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class CP {

	static Connection con;
	
	static Connection create() {
		try {
//			Load Driver
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
//			create connection
			String user = "root";
			String password= "Ashok@123";
			String url = "jdbc:mysql://localhost:3306/student_management";
			
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
