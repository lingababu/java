package com.array;

import java.util.Arrays;

public class FindMinimumElement {

	public static void main(String[] args) {

		int[] arr = new int[] {3, 6,9,11,7,4 };

		int stream = Arrays.stream(arr).min().orElseThrow(() -> new RuntimeException("Array is empty."));

		System.out.println(stream);

	}

}
