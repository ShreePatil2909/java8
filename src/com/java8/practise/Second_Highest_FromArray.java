package com.java8.practise;

import java.util.Arrays;
import java.util.Comparator;

public class Second_Highest_FromArray {

	public static void main(String[] args) {

		Integer a[]= {10,20,30,40,50,60};
		
		Integer integer = Arrays.asList(a).stream().sorted().distinct().skip(a.length-2).findFirst().get();
		System.out.println(integer);
		
		int  b[]= {10,20,30,40,50};
		
		int asInt = Arrays.stream(b).sorted().distinct().skip(b.length-2).findFirst().getAsInt();
		System.out.println(asInt);
		
		Integer integer2 = Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer2);
	}

}
