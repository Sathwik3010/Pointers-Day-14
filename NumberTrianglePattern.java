package com.codegnan.patternexample;

public class NumberTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;
		int num = 1;
		
		for(int i = 1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
