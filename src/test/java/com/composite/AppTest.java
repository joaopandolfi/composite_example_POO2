package com.composite;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	Item item;
	@Before
	public void Before(){
		item = null;
	}
  
	@Test
	public void test1(){
		item = new Part("Jaca",1);
		Assert.assertEquals(item.getDescription(), "Jaca");
	}
	
	@Test
	public void test2(){
		item = new Assembly("Bigodinho");
		Assert.assertEquals(item.getDescription(), "Bigodinho");
	}
	
	@Test
	public void test3(){
		item = new Assembly("Bigodinho");
		
		item.addItem(new Part("jaca", 2));
		item.addItem(new Part("jurubeba", 10));
		
		Assert.assertEquals(item.getCost(), 12);
	}
}
