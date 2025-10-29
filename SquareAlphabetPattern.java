package com.codegnan.patternexample;

public class SquareAlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char ch = 'A';
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
