package com.xworkz.java.patterns;

public class RightTriangle {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				}
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
//              *
//           *  *
//         * *  *
//       * * *  *