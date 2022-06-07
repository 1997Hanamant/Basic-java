package com.xworkz.java.patterns;

public class Pattern2 {
	
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int n=4;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++){
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.println("0");
					
				}
				}
				j--;
				System.out.print("*");
			while(j>=1) {
				if(i==j) {
					System.out.print(" *");
				}
				else {
					System.out.print("0");
				}
				j--;
			}
			System.out.println();
		}
	}

}
// * 0 0 0 * 0 0 0 *
// 0 * 0 0 * 0 0 * 0
// 0 0 * 0 * 0 * 0 0 
// 0 0 0 * * * 0  0 0