package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lenght_Of_EachWorld_InString {

	public static void main(String[] args) {

		String s="I Love My India Love";
		
		String s1[]=s.split(" ");
		String s2[]=s.split("");
		
		Map<Integer, List<String>> collect = Arrays.stream(s1).collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		
	}

}
