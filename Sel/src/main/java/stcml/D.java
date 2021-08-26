package stcml;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D {
	@BeforeTest
	public void BTest() {
		System.out.println("bt");
	}

	@BeforeClass
	public void Bclass() {
		System.out.println("bc");
	}

	@BeforeMethod
	public void Bmethod() {
		System.out.println("bm");
	}

	@Test
	public void testSeven() {
		System.out.println("test 7");
	}

	@Test

	public void testEight() {
		System.out.println("test 8");
	}

	@AfterClass
	public void Aclass() {
		System.out.println("ac");
	}
	@AfterMethod
	public void afMethod() {
		System.out.println("AM");
	}

}
