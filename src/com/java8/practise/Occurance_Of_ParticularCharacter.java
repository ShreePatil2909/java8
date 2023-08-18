package com.java8.practise;

import java.util.Arrays;

public class Occurance_Of_ParticularCharacter {

	public static void main(String[] args) {

		String s="Live In Java";
		
		long count = Arrays.asList(s.split("")).stream().filter(i -> i.equalsIgnoreCase("n")).count();
	
		System.out.println(count);
	}

}
