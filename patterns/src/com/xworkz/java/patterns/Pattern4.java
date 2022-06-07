package com.xworkz.java.patterns;

public class Pattern4 {
	public static void main(String[] args) {
		int n=5;
		int m=5;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1||j==1||i==n||j==m) {
					System.out.print(num+" ");
					num++;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
// 1 2 3 4 5
// 6       7
// 8       9
// 10      11
// 12 13 14 15 16
