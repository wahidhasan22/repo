package stcml;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C {
	@BeforeSuite
	public void bfSuite() {
		System.out.println("BS");
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
	public void testFive() {
		System.out.println("test 5");
	}

	@AfterMethod
	public void Amethod() {
		System.out.println("Am");
	}

	@Test

	public void testSix() {
		System.out.println("test 6");
	}

	@AfterClass
	public void Aclass() {
		System.out.println("ac");
	}

	@AfterSuite
	public void afSuite() {
		System.out.println("AS");
	}
}
