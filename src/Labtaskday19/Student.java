package Labtaskday19;

public class Student {
	
	int studentId;
	String name;
	double examFee;
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	public String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	public double payFee(double amount) {
		return amount-examFee;
	}

}
