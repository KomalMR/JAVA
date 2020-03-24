package com.qa.CheapPrice.Pages;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.CheapPrice.Test_Base.Test_Base;

public class HomePage extends Test_Base 
{

	@FindBy (xpath="//div[@class='form-group col city']/input[@id='to1']") WebElement city;
	//Start Date
	@FindBy (xpath="//span[contains(text(),'Depart')]") WebElement Dt;
	@FindBy (xpath="//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]")WebElement Date;
	//Return Date
	@FindBy(xpath="//div[@id='dates']/span[2]/span")WebElement Rt;
	@FindBy(xpath="//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr[5]/td[1]")WebElement Return;
	//Adults
	@FindBy(xpath="//button[@class='btn btn-close btn-secondary trav-select-inc icn icn-plus' and @data-model='travelers.adults']")
	WebElement Adults;

	@FindBy(xpath="//select[@id='cabin']")WebElement Eco;

	@FindBy(xpath="//button[contains(text(),'Search Flights')]")WebElement Search;
	@FindBy(xpath="//div[@class='btn withsub' and @data-fare-id='AI0-F0']/span") WebElement pr;

	

	public HomePage()//constructor
	{
		PageFactory.initElements(driver,this);
	}

	public void city_select()
	{
		city.sendKeys("Mumbai");

	}

	//Dates
	public void Depart_time() throws InterruptedException
	{
		Dt.click();
		Thread.sleep(2000);
		Date.click();
		Thread.sleep(2000);
		Rt.click();
		Return.click();
		Thread.sleep(2000);
		Adults.click();
	}
	//Economy
	public void Economy()
	{
		Eco.click();
		Select sel=new Select(Eco);
		sel.selectByValue("C");
	}
	//Search Flight
	public void Submit()
	{
		Search.click();
	}

	//SIgnup PopUp
	public void Signup() throws InterruptedException
	{
		String Parent=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator <String> W1=s1.iterator();
		while(W1.hasNext())
		{
			String ChildWindow=W1.next();

			if(!Parent.equals(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
		
		System.out.println(driver.switchTo().window(ChildWindow).getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-close']")).click();
		
			}
		}
	}
	
	public void Price()
	{
		//pr.click();
	}
}
		

