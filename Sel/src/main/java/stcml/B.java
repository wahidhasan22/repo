package stcml;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B {
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
	public void testThree() {
		System.out.println("test 3");
	}
	
	@Test

	public void testFour() {
		System.out.println("test 4");
	}

	@AfterClass
	public void Aclass() {
		System.out.println("ac");
	}
	
	@AfterMethod
	public void Amethod() {
		System.out.println("Am");
	}
	@AfterTest
	public void Ametest() {
		System.out.println("AT");
	}



	

}
