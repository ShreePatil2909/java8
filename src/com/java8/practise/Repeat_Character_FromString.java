package com.java8.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repeat_Character_FromString {

	public static void main(String[] args) {

		String s="Shree";
		
		List<String> list=Arrays.asList(s.split(""));
		
		Map<String, Long> collect = list.stream().filter(i -> Collections.frequency(list, i)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	
	}

}
