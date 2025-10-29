package com.codegnan.patternexample;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=10;
		
		//upper part of the butterfly pattern(Expanding wings)
		for(int i=1;i<=rows;i++) {// outer for loop() controls the current row number
			//inner for loop 1: print the star as left wing
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			// inner for loop 2: print spaces in middle gap.
			// the number spaces decreases as i increases.
			//formula = 2*(rows-i);
			int spaces=2*(rows-i);
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}
			//inner for loop 3 print stars as right wing.
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower part of the butter fly pattern
		for(int i=rows-1;i>=1;i--) { // outer for loop for below butterfly pattern  rows
			// inner for loop 1 downward pattern
			// print the stars on left wing 
			// the number of stars decrease with i.
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner loop2 print spaces.
			int spaces=2*(rows-i);
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}
			
			//inner loop3 print spaces.
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
