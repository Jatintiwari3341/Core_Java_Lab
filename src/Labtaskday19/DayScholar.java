package Labtaskday19;

public class DayScholar extends Student {
	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	
	public String displayDetails() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	public double payFee(double amount) {
						//5000 + 5000 =6000
		double totalFee=transportFee+examFee;
		return totalFee-amount;
	}
	

}
