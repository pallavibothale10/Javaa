package Interface;

public class AdvancedCalculators implements Calculator,Casio {

	@Override
	public void Addition() {
System.out.println("Addition method");		
	}

	@Override
	public void Substraction() {
System.out.println("Substraction method");		
	}

	@Override
	public void Multiplication() {
		System.out.println("multiplication method");
		
	}
	@Override
	public void Tan() {
		System.out.println("Tan Method");
		
	}

	@Override
	public void Log() {
System.out.println("Log method");		
	}

	@Override
	public void Addition(int i) {
	System.out.println("Addition1 method");
	}
	public void Sin() {
		System.out.println("Sin method");
	}
	public void Cos() {
		System.out.println("cos method");
	}


}
