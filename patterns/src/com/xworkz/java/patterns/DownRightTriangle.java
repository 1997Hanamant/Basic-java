package com.xworkz.java.patterns;

public class DownRightTriangle {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}
			   for(int a=1;a<=n;a++) {
				   System.out.print("*");
				   
			   }
			   System.out.println();
		}
	}

}
// * * * *
//   * * * 
//    *  *
//       *