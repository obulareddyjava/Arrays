package com.voterapp;

public class TestVoter {
public static void main(String[] args) {

	VoterValidCheck1 vvc=new VoterValidCheck1(2,"caad");
	try {
		vvc.castVote();
	} catch (InvalidVoter e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(vvc.toString());
	
}
}
