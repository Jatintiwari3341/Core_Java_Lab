package com.task27first;

public class Main {

	public static void main(String[] args) {
		//CourseContent c1=new CourseContent("www");
		Video v1=new Video("java basics",45);
		Article a1=new Article("Understanding OOPS","Ravi Sir");
		Quiz q1=new Quiz("java",20);
		
		
		CourseManager m1=new CourseManager();
		System.out.println("Processing for individual content");
		m1.processContent(v1);
		m1.processContent(a1);
		m1.processContent(q1);
		
		System.out.println();
		System.out.println("Processing for multiple process content");
		m1.processMultipleContents(v1,a1,q1);
		
		
		
		

	}

}
