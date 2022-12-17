package P1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class start {

	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
   System.out.println("WEL COME");
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   while(true) {
	   System.out.println("PRESS 1 to add Student");
	   System.out.println("PRESS 2 to delete Student");
	   System.out.println("PRESS 3 to display Student");
	   System.out.println("PRESS 4 to exit app ");
	   
	   int c= Integer.parseInt(br.readLine());
	   if(c==1) {
		   
		   System.out.println("Enter Student name");
		   String name = br.readLine();
		   
		   System.out.println("Enter Student phone");
		   String phone= br.readLine();
		   
		   System.out.println("Enter Student Age");
		   int age = Integer.parseInt(br.readLine());
		   
		   Student st = new Student(name, phone, age);
		  boolean ans = Studentdao.InsertStudenttoDB(st);
		   if(ans= true) {
			   System.out.println("Successfully Added");
		   }else {
			   System.out.print("Something wrong");
		   }
		   System.out.println(st);
		   
	   }else if(c==2) {
		   System.out.println("Enter Student id");
		   
		   int userid = Integer.parseInt(br.readLine());
		   boolean ans = Studentdao.deleteStudent(userid);
		   if(ans== true) {
			   System.out.println("Student deleted");
		   }else {
			   System.out.println("somthing wrong");
		   }
	   }else if(c==3) {
		   Studentdao.ShowallStudents();
	   }else if(c==4) {
	   
		   break;
       }else {
	   
      }
	}

   System.out.print("Thank you");
}
}
