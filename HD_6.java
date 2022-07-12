/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef

	{
	
	static int fun(int arr[]){
	    int a=0,b=0,c=0,prime=0;
	    
	int n=arr.length;
	boolean flag=true;
	if(n==2)
	return 2;
	int e=0;
	for(int i=0;i<n;i++){
	    flag=true;
	    e=arr[i];
	    if(e%10==0){
	        if(e%3!=0)
	        a++;
	    }
	 else if(e%2==0 && e%3!=0 )
	    a++;
	    else if(e%3==0 && e%2!=0 && e%5!=0)
	    b++;
	    else if(e%5==0 && e%3!=0)
	    c++;
	    else {
	        for(int j=5;j*j<=e;j=j+6){
	            if(e%j==0 || e%(j+2)==0){
	                flag=false;
	                break;
	            }
	        }
	        if(flag==true)
	        prime++;
	        
	        if(prime>=2 || (a>=2 && b>=2) || (a>=2 && c>=2) || (b>=2 && c>=2))
	        return 0;
	        else if(a)
	        
	    }
	 
	}
	return n;
	 
	  	}

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    
	    int res=fun(arr);
	  System.out.println(res);
	}
	}
}
