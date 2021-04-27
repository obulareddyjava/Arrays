package com.exceptionsmar29;

public class Interact {
	
		public static void main(String[] args) {
			try {
			throw new Calculation();
		}catch(Calculation c) {
	      c.add(11, 1212);
		}
			}
	}



