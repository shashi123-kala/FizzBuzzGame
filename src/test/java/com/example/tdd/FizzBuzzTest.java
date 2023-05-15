package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
	
	private  FizzBuzz fizzBuz;
	public static final String NUMBER_DIVISBLEBY_THREE = "Fizz";
	public static final String NUMBER_DIVISBLEBY_FIVE = "Buzz";
	public static final String NUMBER_DIVISBLEBY_BOTH_THREE_AND_FIVE = "FizzBuzz";
	
	
	@Before
    public void initializeGame() {
		fizzBuz = new FizzBuzz();
		assertNotNull(fizzBuz);         
    }
	
	
	@ParameterizedTest
	@CsvSource({
		"1, 1",
		"2, 2",
		"3, Fizz",
		"4, 4",
		"5, Buzz",
		"6, Fizz",
		"7, 7",
		"8, 8",
		"9, Fizz",
		"10, Buzz",
		"11, 11",
		"12, Fizz",
		"13, 13",
		"14, 14",
		"15, FizzBuzz"
	})
	 public void toCheckTheGivenNoisFizzOrBuzzOrFizzBuzz(int number, String expected) {
	    assertEquals(expected , fizzBuz.play(number));

	}

}


