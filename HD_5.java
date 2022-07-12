/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HD_5
{
    static String fun(int arr[],int x){
     
   int  max=arr[0];
   
        int k=arr[0];
        for(int i=1;i<arr.length;i++){
            max=0;
       if(arr[i]<k){
           max=k+arr[i];
           if(max>x )
           return "NO";
           //else
             // k=arr[i];
       }
       if(arr[i]>k)
        k=arr[i];
        
        
            
        }
        
        return "YES";
        
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		 int n=sc.nextInt();
		  int x=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 arr[i]=sc.nextInt();
		
		  String res=fun(arr,x);
		  System.out.println(res);
		}
	}
}
