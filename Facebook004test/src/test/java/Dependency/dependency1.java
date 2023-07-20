package Dependency;

import org.testng.annotations.Test;

// single  dependency in a same test case

public class dependency1 {
	@Test(dependsOnMethods = { "testTwo" })
	public void testOne() {
		System.out.println("Test method one");
	}

	@Test
	public void testTwo() {
		System.out.println("Test method two");
}
}
