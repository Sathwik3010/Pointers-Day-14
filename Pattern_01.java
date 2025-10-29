package com.codegnan.patternexample;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5, columns = 5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
//				System.out.print("* ");
//				System.out.print(i+" ");
//				System.out.print((6-i)+" ");
//				System.out.print(j+" ");
//				System.out.print((6-j)+" ");
				System.out.print((char)(96+i)+" ");
//				System.out.print((char)(96+j)+" ");

			}
			System.out.println();
		}
	}

}
