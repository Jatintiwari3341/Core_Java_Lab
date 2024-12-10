package Labtaskday19;

public class Hosteller extends Student {
	double hostelFee;
	double totalFee;
	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
		this.totalFee=hostelFee+examFee;
	}

	
	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	public double payFee(double amount) {
		
//		
//		if(this.)
//		{
//			return totalFee-amount;
//		}
//		else if(totalFee<amount)
//			return amount-totalFee;
//		else
//			return 0;
		
		return totalFee-amount;
	}
	

}
