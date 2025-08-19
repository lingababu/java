package com.array;

import java.util.Arrays;

public class FindTheAvgOfAllElement {

	public static void main(String[] args) {
		
		int[] arr = {7,8,9,32,66};
		
		double avg =Arrays.stream(arr).average().orElseThrow(() -> new RuntimeException("Array is empty."));
		
		System.out.println(avg);

	}

}
