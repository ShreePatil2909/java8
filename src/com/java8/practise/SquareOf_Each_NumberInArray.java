package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOf_Each_NumberInArray {

	public static void main(String[] args) {

		Integer a[]= {2,3,4,5,6,7,8};
		
		List<Integer> collect = Arrays.stream(a).map(i -> i*i).collect(Collectors.toList());
	
		System.out.println(collect);
	}

}
