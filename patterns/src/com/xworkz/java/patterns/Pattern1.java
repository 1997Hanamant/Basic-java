package com.xworkz.java.patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=5; j>=1;j--) {
			if(j!=i) {
				System.out.print(j);
			}
			else {
				System.out.print("*");
			}
			}
			System.out.println();
		}
	}

}
// 5 4 3 2  *
// 5 4 3 *  1
// 5 4 *3 2 1
// 5 * 4 3 2 1
// * 4 3 2 1