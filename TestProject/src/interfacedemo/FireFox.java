package interfacedemo;

public class FireFox implements WebDriver {

	@Override
	public void launchApplication() {
		// TODO Auto-generated method stub
		System.out.println("FF - Launch Application");
	}

	@Override
	public void typeText() {
		// TODO Auto-generated method stub
		System.out.println("FF - Type Text");
	}

	@Override
	public void clickObject() {
		// TODO Auto-generated method stub
		System.out.println("FF - ClickObject");
	}

}
