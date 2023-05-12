package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
	
	@Test
    public void numberEqualToOne() {
		int number = 1;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("1",numberReturned );
    }
	
	@Test
    public void numberEqualToTwo() {
		int number = 2;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("2",numberReturned );
    }

	@Test
    public void numberEqualToThree() {
		int number = 3;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals(NUMBER_DIVISBLEBY_THREE,numberReturned );
    }
	
	@Test
    public void numberEqualToFour() {
		int number = 4;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("4",numberReturned );
    }
	
	@Test
    public void numberEqualToFive() {
		int number = 5;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals(NUMBER_DIVISBLEBY_FIVE,numberReturned );
    }
	
	@Test
    public void numberEqualToSix() {
		int number = 6;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals(NUMBER_DIVISBLEBY_THREE,numberReturned );
    }
	
	@Test
    public void numberEqualToSeven() {
		int number = 7;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("7",numberReturned );
    }
	
	@Test
    public void numberEqualToEight() {
		int number = 8;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("8",numberReturned );
    }
	
	@Test
    public void numberEqualToNine() {
		int number = 9;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals(NUMBER_DIVISBLEBY_THREE,numberReturned );
    }
	
	@Test
    public void numberEqualToTen() {
		int number = 10;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals(NUMBER_DIVISBLEBY_FIVE,numberReturned );
    }
	

	@Test
    public void numberEqualToEleven() {
		int number = 11;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("11",numberReturned );
    }
	
	@Test
    public void numberEqualToTweleve() {
		int number = 12;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("Fizz",numberReturned );
    }
	
	@Test
    public void numberEqualToThirteen() {
		int number = 13;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("13",numberReturned );
    }
	
	@Test
    public void numberEqualToFourteen() {
		int number = 14;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("14",numberReturned );
    }
	
	@Test
    public void numberEqualToFifteen() {
		int number = 15;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals(NUMBER_DIVISBLEBY_BOTH_THREE_AND_FIVE,numberReturned );
    }
}


