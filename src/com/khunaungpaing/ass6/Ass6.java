package com.khunaungpaing.ass6;

public class Ass6 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			int num = 1;
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 8; k >= i*2; k--) {
				System.out.print(num);
				num++;
			}

			System.out.println();
		}
	
	}
}
