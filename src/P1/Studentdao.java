package P1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {

	static boolean InsertStudenttoDB(Student st) {
		
		boolean f= false;
		try {
		//   jdbc code
			Connection con = CP.create();
			String q = "insert into students(Studentname, phoneNo, StudentAge) values(?, ?, ?)";
//			prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
//			set values for parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setInt(3, st.getStudentAge());
//			execute
			
			pstmt.executeUpdate();
			f= true;
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static boolean deleteStudent(int userid) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
		//   jdbc code
			Connection con = CP.create();
			String q = "delete from Students where id=?";
//			prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
//			set values for parameters
			pstmt.setInt(1, userid);
			
//			execute
			
			pstmt.executeUpdate();
			f= true;
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void ShowallStudents() {
		// TODO Auto-generated method stub
//		boolean f= false;
		try {
		//   jdbc code
			Connection con = CP.create();
			String q = "select * from Students";
//		creat Stament
			Statement stmt =con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
			
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			int age = set.getInt(4);
			
			System.out.println("id: "+id);
			System.out.println("Name: "+name);
			System.out.println("PhoneNo: "+phone);
			System.out.println("Age: "+age);
			System.out.println("------------------------");
		}
		
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
