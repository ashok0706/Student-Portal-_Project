package P1;
import java.util.*;

public class Student{
	private int id;
	private String  StudentName;
	private String StudentPhone;
	private int StudentAge;
	/**
	 * @param id
	 * @param studentName
	 * @param studentPhone
	 * @param studentAge
	 */
	public Student( String studentName, String studentPhone, int studentAge) {
		super();
//		this.id = id;
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentAge = studentAge;
	}
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getStudentName() {
		return StudentName;
	}
//	public void setStudentName(String studentName) {
//		StudentName = studentName;
//	}
	public String getStudentPhone() {
		return StudentPhone;
	}
//	public void setStudentPhone(String studentPhone) {
//		StudentPhone = studentPhone;
//	}
	public int getStudentAge() {
		return StudentAge;
	}
//	public void setStudentAge(int studentAge) {
//		StudentAge = studentAge;
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone + ", StudentAge="
				+ StudentAge + "]";
	}
	
	

}
