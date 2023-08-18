package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOf_EvenNumber_InArray {

	public static void main(String[] args) {

		Integer a[]= {1,2,3,4,5,6,7,8,9};
		
		List<Integer> collect = Arrays.stream(a).filter(i -> i%2==0).map(j -> j*j).collect(Collectors.toList());
		System.out.println(collect);

	}

}
