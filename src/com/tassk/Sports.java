package com.tassk;

public class Sports {
private String sportsName;
private int teamSize ;
private String sportsType;
public Sports() {
	super();
}
public Sports(String sportsName, int teamSize) {
	super();
	this.sportsName = sportsName;
	this.teamSize = teamSize;
}
public Sports(String sportsName, int teamSize, String sportsType) {
	super();
	this.sportsName = sportsName;
	if(teamSize<=0) {
		System.err.println("team size must be positive");
	}
	else {
	this.teamSize = teamSize;
	
	}
	this.sportsType = sportsType;
}
public void display() {
	System.out.println("the name of sports is "+sportsName);
	System.out.println("the team size is "+teamSize);
	System.out.println("the sports type is "+sportsType);
}


}
