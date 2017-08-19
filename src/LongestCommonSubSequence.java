
public class LongestCommonSubSequence
{
	public  static void lcs(String one,String two,int m,int n)
	{
		
		int arr[][]=new int[m+1][n+1];
		
		// Following is the code which fills the above two dimensional matrix using DP

		 for(int i=0;i<=m;i++)
		 {
			 for(int j=0;j<=n;j++)
			 {		 
				 if((i==0)||(j==0))
				 {
					 arr[i][j]=0; 
				 }
				 
				 else if(one.charAt(i-1)==two.charAt(j-1))
				 {
					 arr[i][j]=1+arr[i-1][j-1];
				 }
				 
				 else
				 {
					 arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);		 
				 } 
			 }		 
		 }
		 
		 System.out.println("The Length of Maximum Sub Sequence is"+ arr[m][n]);
       
		 StringBuffer sb=new StringBuffer();
		 
		 int i=m;
		 int j=n;
		 
		 while(i>0 && j>0)
		 {
	        
			 if(one.charAt(i-1)==two.charAt(j-1))
			 {
				 
				 String str=Character.toString(one.charAt(i-1));
				 sb.append(str);
				 i--;
				 j--;
				 
			 }
			 
			 else  if(arr[i-1][j]>arr[i][j-1])
			 {
				 i--;
			 }
			 
			 else
			 {
				j--; 
			 }
			  
		 }
	
		 System.out.println(sb.reverse().toString());
		 		
	}
	

	public static void main(String[] args) 
	{	
		String one="AGGTAB";
		String two="GXTXAYB";
		
		lcs(one,two,one.length(),two.length());
		
		
				
	}

}
