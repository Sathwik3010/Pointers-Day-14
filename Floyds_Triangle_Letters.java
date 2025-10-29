package com.codegnan.patternexample;

public class Floyds_Triangle_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
