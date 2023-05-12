package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
    public void initializeGame() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertNotNull( fizzBuzz );
    }

}
