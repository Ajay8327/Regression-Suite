package TestNg_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations_testng {
  
	@BeforeSuite
  public void beforesuite() {
		System.out.println("*************** Before Suite **************");
  }
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("************ After Suite *****************");
	}
	
	@Test
	public void Tes1() {
		System.out.println("This is test one ");
	}
	
	@Test
	public void Tes2() {
		System.out.println("This is test two ");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("&&&&&&&&&&&&& Before Test &&&&&&&&&&&&");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("&&&&&&&&&&&&& After Test &&&&&&&&&&&&");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("$$$$$$$$$$$$$$$$$ Before Class $$$$$$$$$$$$$");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("$$$$$$$$$$$$$$$$$ After Class $$$$$$$$$$$$$");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("$$$$$$$$$$$$$$$$$ Before Method $$$$$$$$$$$$$");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("$$$$$$$$$$$$$$$$$ After MEthod $$$$$$$$$$$$$");
	}
	
	public class retry {
		@Test
		public void Tes3() {
			System.out.println("This is Test 3");
		}
	}
	
}
