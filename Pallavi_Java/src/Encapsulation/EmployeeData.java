package Encapsulation;

public class EmployeeData {
	//implement encapsulation
	//Private data variables can not access  directly from outside the class
	
	private int IDNumber;
	private String EmpName;
	private int EmpAge;
	public static void main(String[] args) {
		
		EmployeeData ED = new EmployeeData();
		ED.setIDNumber(34256);
		ED.setEmpName("Pallavi");
		ED.setEmpAge(26);
		
		System.out.println("Employee name is : " +ED.getIDNumber());
		System.out.println("Employee name is : " +ED.getEmpName());
		System.out.println("Employee name is : " +ED.getEmpAge());

		
	}
	//getter and setter methods is to set and get the values of the fields
	public int getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(int IDNumber) {
		this.IDNumber=IDNumber;              // using this we assign global variable to local
//		public void setIDNumber(int iDNumber) {
//   	IDNumber = iDNumber;
//   }
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName=EmpName;
	}
//	public void setEmpName(String empName) {
//		EmpName = empName;
//	}
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int EmpAge) {
		this.EmpAge=EmpAge;
	}
//	public void setEmpAge(int empAge) {
//		EmpAge = empAge;
//	}

	
	
	
	
	
}
