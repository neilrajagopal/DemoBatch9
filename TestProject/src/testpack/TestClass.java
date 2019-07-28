package testpack;

public class TestClass {

	public static void demoFun()
	{
		System.out.println("Static Function");
	}
	
	public void demoNonStatic()
	{
		System.out.println("Non Static Function");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Function");
		demoFun();
		TestClass t = new TestClass();
		t.demoNonStatic();
	}

}
