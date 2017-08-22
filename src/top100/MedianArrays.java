package top100;

import java.util.Arrays;

public class MedianArrays 
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        
        int len=nums1.length+nums2.length;
        
        int arr[]=new int[len];
        
        int count=0;
        
        if(nums1.length > 0)
        {
        
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
            count=i;
        }
            count++; 
        }    
        
        
        
        if(nums2.length > 0)
        {
        
        for(int i=0;i<nums2.length;i++)
        {
            arr[count]=nums2[i];
            count++;   
        }
            
        }    
        
        Arrays.sort(arr);
        
        if(len % 2 == 0)
        {
            int val1=len/2;
            
            int val2=len/2-1;
            
            double finaval=arr[val1]+arr[val2];
            
            finaval=finaval/2;
            
            return finaval;   
        }
        else
        {
            int val=(len)/2;
            
            System.out.println(val);
            
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            
            return arr[val];
            
            
        }
         
        
    }

	
	public static void main(String args[])
	{
		
		//logic to pass the values to the function findMedianSortedArrays
	}
}

