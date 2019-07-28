package interfacedemo;

public class PublicUse {

	public static void main(String[] args) {

		WebDriver driver  =	new ChromeDriver();
		driver.launchApplication();
		driver.typeText();
		driver.clickObject();
		System.out.println("---------------------");
		
		driver = new FireFox();
		driver.launchApplication();
		driver.typeText();
		driver.clickObject();
		
		
	}

}
