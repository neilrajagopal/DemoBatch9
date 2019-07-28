package interfacedemo;

public class ChromeDriver implements WebDriver {

	@Override
	public void launchApplication() {
		System.out.println("Chrome - Launch Application"); 		
	}

	@Override
	public void typeText() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Type Text");
	}

	@Override
	public void clickObject() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Click Object");
	}

}
