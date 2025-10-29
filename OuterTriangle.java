package com.codegnan.patternexample;

public class OuterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j = i;j<row;j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j<=(2 * i -1); j++) {
				if(i == row || j == 1 || j == (2 * i - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
