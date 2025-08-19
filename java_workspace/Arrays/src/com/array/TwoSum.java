package com.array;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 2, 3, 1 };

		TwoSum.twoSum(arr);

	}

	public static void twoSum(int[] arr) {

		int target = 14;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					System.out.println(i + "," + j);
				}
			}

		}

	}

}
