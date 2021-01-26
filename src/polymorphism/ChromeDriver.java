package polymorphism;

public class ChromeDriver extends WebDriver {
	
	//Method Overriding -Run time  polymorphism 
	
	public void click()
	{
		System.out.println("ChromeDriver click() executed");
	}
	
	public void sendKeys(String str)
	{
		System.out.println("ChromeDriver sendKeys() executed");
	}

}
