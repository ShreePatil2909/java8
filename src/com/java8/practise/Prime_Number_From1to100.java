package com.java8.practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prime_Number_From1to100 {

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 7, 17, 11, 20, 19, 20 };

		Arrays.stream(a).filter(Prime_Number_From1to100::isPrime).forEach(num -> System.out.print(num + " "));

	}

	public static boolean isPrime(int num) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
	}

}
