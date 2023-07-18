package Inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Father F1= new Father();
		F1.Car();
		F1.Flat();
		F1.Money();
		
		System.out.println();
		
		Son S1 = new Son();
		S1.Bike();
		S1.Car();
		S1.Flat();
		S1.Money();
		System.out.println();
		System.out.println("*********************");
		/* -------------------------------------*/
		WhatsApp1 W1 = new WhatsApp1();
		W1.TextMassege();
		
		System.out.println();

		WhatsApp2 W2 = new WhatsApp2();
		W2.TextMassege();
		W2.AudioCall();
		
		System.out.println();

		WhatsApp3 W3 = new WhatsApp3();
		W3.TextMassege();
		W3.AudioCall();
		W3.VideoCall();
		
		System.out.println();

		WhatsApp4 W4 = new WhatsApp4();
		W4.TextMassege();
		W4.AudioCall();
		W4.VideoCall();
		W4.Payment();
		
	}

}
