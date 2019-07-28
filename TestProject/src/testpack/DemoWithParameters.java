package testpack;

public class DemoWithParameters {

	public int demoClac(int a, int b, String opr)
	{
		int result = 0;
		if(opr.equals("+"))
		{
			result=a+b;
		}else if(opr.equals("-"))
		{
			result = a-b;
		}else if(opr.equals("*"))
		{
			result = a*b;
		}else
		{
			System.out.println("Invalid Operator");
		}
		//System.out.println("Calculated Result: "+ result);
		return result;
	}

	public int demoSwitch(int a, int b, String opr)
	{
		int result=0;
		switch(opr)
		{
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;

		case "*":
			result = a*b;
			break;
		default:
			System.out.println("Invalid operator");
		}
		return result;
	}
	public static void main(String[] args) {
		DemoWithParameters d = new DemoWithParameters();
		//int a = d.demoClac(10, 20, "+");
		int a = d.demoSwitch(10, 20, "-");
		System.out.println("Main Function: "+a);

	}

}
