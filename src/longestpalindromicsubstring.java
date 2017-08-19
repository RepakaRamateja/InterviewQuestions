
public class longestpalindromicsubstring 
{

	    public String longestPalindrome(String s) 
	    {
	        int n=s.length();
	        
	        boolean arr[][]=new boolean[n][n];
	        
	        int startindex=0;//start index of the palindrome
	        
	        int maxlength=1;
	        
	        
	        //logic for updating single letter
	        
	        for(int i=0;i<n;i++)
	        {
	            arr[i][i]=true;
	        }
	        
	        //logic for updating two letter palindrome
	        
	        for(int i=0;i<n-1;i++)
	        {
	            if(s.charAt(i)==s.charAt(i+1))
	            {
	                arr[i][i+1]=true;
	                startindex=i;
	                maxlength=2;
	            }   
	        }
	        
	        //logic for three letter palindromes
	        for(int pallength=3;pallength<=n;pallength++)
	        {
	            for(int i=0;i< n-pallength+1;i++)
	            {
	                int j=i+pallength-1;
	                
	                if(s.charAt(i)==s.charAt(j) && arr[i+1][j-1] )
	                {
	                    
	                    arr[i][j]=true;
	                    maxlength=pallength;
	                    startindex=i;
	                    
	                }                
	            }   
	        }
	        
	        return(s.substring(startindex,maxlength+startindex));  
	    }
	
	
	public static void main(String[] args)
	{
		
		longestpalindromicsubstring lon=new longestpalindromicsubstring();
		
		System.out.println(lon.longestPalindrome("bananas"));
		
		
	}
	
	
	
	
	
}
