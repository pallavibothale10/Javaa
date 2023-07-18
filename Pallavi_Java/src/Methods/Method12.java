package Methods;

public class Method12 {

	public static void main(String[] args) {
		
		Method12.StudentInfo("Sayali", 10, 70.12f, 'B');
		Method12.StudentInfo("Radha", 6, 80.16f, 'A');
		Method12.StudentInfo("Ganesh", 32, 79.54f, 'A');
		Method12.StudentInfo("Dinesh", 34, 56, 'C');
		
	}
	public static void StudentInfo(String StudentName, int Rollno, float Percentage, char Grade)
	{
		System.out.println("StudentName-->" +StudentName +" , "+ "Rollno-->" +Rollno+ " , "+ "Percentage-->" +Percentage + " , "+ "Grade-->" +Grade);
		
	}
}
