package testpack;

public class StringSwap {

	public static void main(String[] args) {

		//29/06/2019
		//29/June/2019
		//int[] a={1,4,0,2,6,0,9,8};
		
		String[] mon={"","JAN","FEB","MAR","APR","MAY","JUN"};
	//	System.out.println(mon[6]);
		//dd/mm/yyyy
		//mm/dd/yyyy
		String d = "06/29/2019";
		String[] sw=d.split("/");
	//	System.out.println(sw[1]);
		try{
		System.out.println(sw[0]+"/"+mon[Integer.parseInt(sw[1])]+"/"+sw[2]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide valid date "+e);
		}catch(Exception e)
		{
			System.out.println("ERROR -"+e);
		}
		
		System.out.println("some code");
	}

}
