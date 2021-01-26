package polymorphism;

public class TestCase {
	
	public static void main(String[] args) {
		
		String browserName="firefox";
	
		WebDriver driver= TestCase.getBrowserObject(browserName);
		driver.click();//2
		driver.sendKeys("dfsdf");//3
		driver.click();//4
		
		
	}

	//Run time polymorhism
	public static  WebDriver getBrowserObject(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			return new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			return new ChromeDriver();
		}
		else
		{
			return new FirefoxDriver();
		}
		
	}
}
