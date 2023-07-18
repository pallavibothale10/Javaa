package Encapsulation;

public class EmpData1 {

	public static void main(String[] args) {
		
		EmployeeData ED = new EmployeeData();
		ED.setIDNumber(33256);
		ED.setEmpName("Pal");
		ED.setEmpAge(21);
		
		System.out.println("Employee name is : " +ED.getIDNumber());
		System.out.println("Employee name is : " +ED.getEmpName());
		System.out.println("Employee name is : " +ED.getEmpAge());

	}
}
