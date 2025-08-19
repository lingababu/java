package com.array;

public class FindMaxElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 7, 0, 4,11};

		System.out.println(findMaxElement(arr));

	}

	public static int findMaxElement(int[] arr) {//1,3,7,0,4


		int max=arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;

	}

}
