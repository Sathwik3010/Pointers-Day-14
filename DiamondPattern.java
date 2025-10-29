package com.codegnan.patternexample;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows =10;
		//upper part of the diamond(full pyramid)
		for(int i=1;i<=rows;i++) { // outer for loop for rows(1 to rows)
			for(int j=1;j<=rows-i;j++) {
				// inner loop 1: prints lading spaces.
				System.out.print("  ");
			}
			//inner loop 2
			for(int k = 1;k <= 2*i-1; k++) {
				System.out.print(" *");
			}
			System.out.println();// new line for each row
		}
		// lower part of the diamond(inverted full pyramid)
		for(int i=rows-1;i>=1;i--) {// outer for loop for rows in downward.
			// inner for loop 1. printing spaces.
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
