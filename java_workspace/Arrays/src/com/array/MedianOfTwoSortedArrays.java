package com.array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] num1 = new int[] { 1, 2 };
		int[] num2 = new int[] { 3, 4};

		int[] merged = Arrays.stream(new int[][] { num1, num2 }).flatMapToInt(Arrays::stream).toArray();

		int n = merged.length;
		double median;

		if (n % 2 == 0) {
			median = (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
		} else
			median = merged[n / 2];

		System.out.println(Arrays.toString(merged));

		System.out.println("Median: " + median);

	}

}
