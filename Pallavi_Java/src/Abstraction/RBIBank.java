package Abstraction;

public abstract class RBIBank {
	public void Loan() { // non abstract method
		
		System.out.println("RBI-->Loan");
	}
	public abstract void Creditcard();  // abstract method

	public abstract void Debitcard();   // abstract method

	public static void main(String[] args) {

		HDFCBank HB = new HDFCBank(); //Static binding + comp time poly 
		HB.Creditcard();//HDFC Creditcard
		HB.Debitcard();
		HB.Loan();
		HB.Funds();
		
		//RBIBank RB = new RBIBank();
		
		RBIBank RB = new HDFCBank(); //Dynamic binding +run time poly
		RB.Creditcard();
		RB.Debitcard();
		RB.Loan();
		
		//HDFCBank HD = newRBIBank();
	}
}
