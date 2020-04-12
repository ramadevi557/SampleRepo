package org.readn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class B1 {
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
	
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		System.out.println("After");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test");
	}




	
	

}
