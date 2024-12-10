package Labtaskday19;

public class Main {

	public static void main(String[] args) {
		Hosteller h1=new Hosteller(101,"raj",5000,2000);
	//	System.out.println(h1);
		System.out.println(h1.displayDetails());
		double payFee = h1.payFee(5000);
		if(payFee<0) {
			System.out.println("the amount is negative "+payFee);
		}
		else if(payFee>0) {
			System.out.println("extra amount to  pay "+payFee);
		}
		else {
			System.out.println("All fees are clear");
		}
		//double payFee3 = h1.payFee(5000);
		System.out.println("The remaining to pay is "+payFee);
		//System.out.println("The remaining to pay is "+payFee3);
		DayScholar s1=new DayScholar(20,"ram",3000,2000);
		System.out.println(s1.displayDetails());
		double payFee2=s1.payFee(7000);
		if(payFee2<0) {
			System.out.println("the amount is negative "+payFee2);
		}
		else if(payFee2>0) {
			System.out.println("the extra amount is pay "+payFee2);
		}
		else {
			System.out.println("All fees are clear");
		}
		System.out.println("the remaining to pay is "+payFee2);
//		double payFee2 = h1.payFee(15000);
//		System.out.println("The remaining to pay is "+payFee2);
		
		

	}

}
