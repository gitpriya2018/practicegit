package testscript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamp {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("-------BeforeTest------");
	}
	@Test(groups = {"sanity"},priority =1)
	public void tests()
	{
		System.out.println("-------Test1------");
	}
	@Test
	public void test2()
	{
		System.out.println("-------Test2------");
	}
	@Test(groups = {"regression","sanity"},priority =3)
	public void test3()
	{
		System.out.println("-------Test3------");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("-------afterTest------");
		
	}
			

}
