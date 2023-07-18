package Interface;

public class HSBC_Bank implements RBIBank, UsBank,BazilBank {

	public void HomeLoan() {
		System.out.println("Home loan method");
	}
	public void GoldLoan() {
		System.out.println("GoldLoan method");
	}
	
	@Override
	public void PersonalLoan() {
		System.out.println("PersonalLoan method");
		
	}
	@Override
	public void BikeLoan() {
System.out.println("BikeLoan method");		
	}
	@Override
	public void CarLoan() {
System.out.println("CarLoan method");		
	}
	@Override
	public void MutualFund() {
		System.out.println("MutualFund method");
	}
	@Override
	public void CreditCard() {
System.out.println("CreditCard method");		
	}
	@Override
	public void DebitCard() {
		System.out.println("DebitCard method");
		
	}
	@Override
	public void TransferMoney() {
System.out.println("TransferMoney Method");		
	}
	public static void main(String[] args) {
		HSBC_Bank HB= new HSBC_Bank();
		HB.HomeLoan();HB.BikeLoan();HB.CarLoan();HB.CreditCard();
		HB.DebitCard(); HB.GoldLoan();HB.MutualFund();HB.PersonalLoan();
		HB.TransferMoney();
		
		System.out.println();
		RBIBank RB = new HSBC_Bank();
		RB.CreditCard(); RB.TransferMoney();
		 
		
		
		
		
		
	}
}
