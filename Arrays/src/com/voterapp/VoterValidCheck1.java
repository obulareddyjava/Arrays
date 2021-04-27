package com.voterapp;

public class VoterValidCheck1 {
	private int age;
	
	private String vname;
  



public VoterValidCheck1(int age, String vname) {
		
		this.age = age;
		this.vname = vname;
	}
public boolean castVote()  {
	if(age<18) {
		throw new InvalidVoter("not valid to vote");
	}
	  return true;
  }
@Override
public String toString() {
	return "VoterValidCheck [age=" + age + ", vname=" + vname + "]";
}

		
}
