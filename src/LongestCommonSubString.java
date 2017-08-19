import java.util.ArrayList;

public class LongestCommonSubString 
{
	public static void findcommonsubstring(String one,String two)
	{
		int m[][]=new int[one.length()][two.length()];
		
		int max=0;
		
		ArrayList<String> result=null;
		
		for(int i=0;i<one.length();i++)
		{
			for(int j=0;j<two.length();j++)
			{
				if(one.charAt(i)==two.charAt(j))
				{					
					if(i==0||j==0)
					{
						m[i][j]=1;
						max=1;
					}
					else
					{
						m[i][j]=m[i-1][j-1] + 1;
					}
					
					if(m[i][j] > max)
					{
						max=m[i][j];
						result=new ArrayList<String>();
					    result.add(one.substring(i-max+1, i+1));
					}	
					
				}
				
				else
				{
					m[i][j]=0;
				}
				
			}
			
		}
		
		for(String str: result)
		{
			System.out.println(str);
		}

		for(int i=0;i<one.length();i++)
		{
			
			for(int j=0;j<two.length();j++)
			{
				
				System.out.print(m[i][j]);
				
			}
			System.out.println();
		}
					
	}
	
	public static void main(String args[])
	{
		String one="CLCL";
		String two="LCLC";
		
		findcommonsubstring(one,two);	
	}
}
