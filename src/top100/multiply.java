package top100;

public class multiply
{
	
	public static void main(String args[])
	{
		
		int x=5;
		int y=9;
		
		while(y!=0)
		{
			int carry= x&y;
			 x=x^y;
			y=carry << 1;
			
		}
		
		System.out.println("the sum is"+x);
		
		
	}

}
