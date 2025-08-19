package com.array;

public class Demo {


	public static void main(String[] args) {
		
		int[] arr = new int[] { 12, 14, 5, 21, 22, 34 };
		
		Demo.sumOfArray(arr);

	}

	public static void sumOfArray(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		System.out.println("Sum of array elements: " + sum);
	}

}
