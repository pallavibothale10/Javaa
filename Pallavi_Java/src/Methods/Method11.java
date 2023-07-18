package Methods;

public class Method11 {
	
	public static void main(String[] args) {
		
		Method11.Studentname("Ankit");
		Method11.Studentname("Akash");

		Method11.Studentinfo("Arti", 12);
		Method11.Studentinfo("Pooja", 10);
		
	}
	
	public static void Studentname(String Name)
	{
		System.out.println("Student Name-->" +Name);
	}
	
	public static void Studentinfo(String Name, int RollNo)
	{
		System.out.println("Student Info-->" +Name+" "+RollNo);
	}

}
