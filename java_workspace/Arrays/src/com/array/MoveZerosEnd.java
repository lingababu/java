package com.array;

public class MoveZerosEnd {

	public static void main(String[] args) {

		int[] num = { 0, 1, 0, 3, 12,0};
		
		moveZerosToEnd(num);
		
		for(int n : num) {
			System.out.print(n+ " ");
		}

	}

	public static void moveZerosToEnd(int[] num) {

		int insertpositions = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				num[insertpositions++] = num[i];
			}
		}

		while (insertpositions < num.length) {
			num[insertpositions++] = 0;
		}

	}

}
