package com.qa.CheapPrice.Test_Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Base
{
	FileInputStream fis;
	public static Properties prop;
	public	static WebDriver driver ;

	public Test_Base()//constructor
	{
		try {
			fis=new FileInputStream("C:\\Users\\Ankush\\eclipse-BasicJava\\CheapPrice\\src\\main\\java\\com\\qa\\CheapPrice\\Config\\config.properties");
			prop=new Properties();
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{

			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void initialize()
	{
		String browser_name=prop.getProperty("browser");
		String url_name=prop.getProperty("url");

		if(browser_name.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.navigate().to(url_name);
			driver.manage().window().maximize();

		}

	}
}
