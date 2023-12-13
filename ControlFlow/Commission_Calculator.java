package ControlFlow;

public class Commission_Calculator {

	public static void main(String[] a) {
		float a1 = Float.parseFloat(a[0]);
		
		if(a1>=10000)
		{
			System.out.println("Commission : "+(a1/100)*30);
		}
		else if(a1>=5001 && a1<=9999)
		{
			System.out.println("Commission : "+(a1/100)*20);
		}
		else if(a1>=1001  && a1<=4999)
		{
			System.out.println("Commission : "+(a1/100)*10);
		}
		else
			System.out.println(" No commission");
		
		
	}

}
