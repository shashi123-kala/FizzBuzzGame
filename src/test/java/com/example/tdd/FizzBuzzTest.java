package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private  FizzBuzz fizzBuz;
	
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

}
