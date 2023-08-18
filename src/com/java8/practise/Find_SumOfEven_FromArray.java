package com.java8.practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Find_SumOfEven_FromArray {

	public static void main(String[] args) {

		int sum=IntStream.range(0, 10).filter(i -> i%2==0).sum();
		System.out.println(sum);
		
		Integer a[]= {1,2,3,4,5,6,7,8,9,10};
		
//		int sum2 = Arrays.stream(a).filter(i -> i%2==0).sum();
//		System.out.println(sum2);
		
		int sum3 = Arrays.stream(a).filter(i -> i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum3);
	}

}
