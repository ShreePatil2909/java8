package com.java8.interview;

public class Closest_Number {

	public static void main(String[] args) {

		int []num= {-7,-4,0,1,5,7};
		
		int closestNumber = 5;
		
		for(int i=1;i<num.length;i++) {
			
			if(Math.abs(num[i])<=Math.abs(closestNumber)) {
				closestNumber=num[i];
			}
		}
		System.out.println("The closest Number "+closestNumber);
		
	}

} 
