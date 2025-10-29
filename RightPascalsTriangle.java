package com.codegnan.patternexample;

public class RightPascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		
		// Upper half of the triangle
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
