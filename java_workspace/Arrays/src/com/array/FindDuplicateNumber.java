package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int[] num = { 1, 3, 4, 2,4,2};

		List<Integer> duplicates= Arrays.stream(num)
				                        .boxed()
				                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				                        .entrySet().stream()
				                        .filter(e -> e.getValue() >1)
				                        .map(Map.Entry:: getKey)
				                        .toList();
		
		System.out.println("Duplicate are: "+ duplicates);

	}
}
