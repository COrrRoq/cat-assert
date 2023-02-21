package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test
	public void testCatDead() {
		Cat cat = new Cat();
		assert (cat.isAlive());
		cat.runs();
		cat.runs();
		if(cat.howHungry() <= 100);
		assertTrue(cat.isAlive() == false);
	}	
	
	@Test
	public void testCatEatsAndRunsOnce() {
		Cat cat = new Cat();
		assert (cat.isAlive());
		cat.feeds();
		cat.runs();
		assertEquals(cat.howHungry(), 60);
	}
	
	@Test
	public void testCatEatsAndRunsLoop() {
		Cat cat = new Cat();
		assert (cat.isAlive());
		cat.runs();
		if (cat.howHungry() <= 50) {
			cat.feeds();}
	}
		
}
