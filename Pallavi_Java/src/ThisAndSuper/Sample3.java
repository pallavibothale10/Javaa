package ThisAndSuper;

public class Sample3 extends Sample2{ 
	
	
	int RollNo=20;
	String Name = "Selenium";
	
	public void Demo() {
		int RollNo=30;
		String Name = "python";
	System.out.println(RollNo);	//30
	System.out.println(Name);//python
	System.out.println();
	System.out.println(this.RollNo);//20	
	System.out.println(this.Name);// selenium
	System.out.println();
	System.out.println(super.Name);//	10
	System.out.println(super.RollNo);//java 
	//Super is use to call diff class obj
	System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Sample3 S1 = new Sample3();
		S1.Demo();
	}

}
