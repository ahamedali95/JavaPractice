// Write a function `commonPrimeFactors` that takes in two numbers as arguments
// and returns an array of all prime factors that are common between the
// two numbers. A factor is a number that divides another number without
// resulting in a remainder.
//
// Examples:
//
// commonPrimeFactors(12, 50); // => [ 2 ]
// commonPrimeFactors(6, 24); // => [ 2, 3 ]
// commonPrimeFactors(11,22); // => [ 11 ]
// commonPrimeFactors(45, 60); // => [ 3, 5 ]
import java.io.*; 
import java.util.*;

public class CommonPrimeFactors {
	private final static boolean isPrime(int num) {
		if(num < 2) return false;
	
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
	
	private final static ArrayList<Integer> CommonPrimeFactors(int num1, int num2) {
		final int min = Math.min(num1, num2);
		final ArrayList<Integer> nums = new ArrayList<Integer>(0); 
		
		for(int i = 2; i <= min; i++) {
			if(num1 % i == 0 && num2 % i == 0 && isPrime(i)) nums.add(i);
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		final int num1 = 45;
		final int num2 = 60;
		final ArrayList<Integer> result = CommonPrimeFactors(num1, num2);
		System.out.println(result);
	}
}


