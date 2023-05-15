package com.example.tdd;

import java.util.Optional;

public class FizzBuzz {

public String play(int number) {	
	String result = Optional.of(number) 
			.map(n ->
			 ((n % 3 == 0 && n % 5 == 0) ? "FizzBuzz" : "")
			+ (n % 3 == 0 ? "Fizz" : "")
			+ (n % 5 == 0 ? "Buzz" : "")) .get(); 
	return result.isEmpty() ? Integer.toString(number) : result;		
		
	}
}
