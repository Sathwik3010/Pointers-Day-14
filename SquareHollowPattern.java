package com.codegnan.patternexample;

public class SquareHollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6; // size of the square

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				// print * for first/last row or first/last column
				if(i == 0 || i == n-1 || j == 0 || j == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // move to next line
		}
	}

}
