package com.task35sec;

public class ClassCastExceptionDemo {
	
	public static void handleClassCastException() {
		 
		try {
			Object arr[]= {"virat","Dhoni",1};
			for (Object object : arr) {
				String s=(String)object;
				System.out.println("Casting Successful:"+s);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		handleClassCastException();

	}

}
