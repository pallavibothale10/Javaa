package Abstraction;

public class TestClass {

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
