package com.qa.CheapPrice.Test_Cases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.CheapPrice.Pages.HomePage;
import com.qa.CheapPrice.Test_Base.Test_Base;

public class HomePage_Test extends Test_Base {

	public HomePage homePage;

	public HomePage_Test() //constructors
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialize();//Test_BaseMethod Calling
		homePage=new HomePage();

	}

	@Test(priority=1)
	public void city_select_Test() throws InterruptedException 
	{
		//all the home Page Method
		homePage.city_select();
		homePage.Depart_time();
		homePage.Economy();
		homePage.Submit();
		homePage.Signup();
		Thread.sleep(5000);
		
		homePage.Price();
		driver.close();
		
	}
	
}
