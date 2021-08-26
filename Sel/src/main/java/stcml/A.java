package stcml;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
@BeforeClass
public void Bclass() {
	System.out.println("bc");
}
@BeforeMethod
public void Bmethod() {
	System.out.println("bm");
}
@Test
public void testone() {
	System.out.println("test 1");
}
@AfterMethod
public void Amethod() {
	System.out.println("Am");
}
@Test

public void testtwo() {
	System.out.println("test 2");
}
@AfterClass
public void Aclass() {
	System.out.println("ac");
}

}
