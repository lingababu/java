package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] arr = {2,4,3,1,8,54,87};
		
		List<Integer> lst =Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(lst.reversed());

	}

}
