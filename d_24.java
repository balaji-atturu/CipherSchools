import java.io.*;
import java.util.*;

public class d_24{
	
	static int subSequence(int arr[],int n){
		int j=0;
		int i=0;
		int count=0;
		int temp[]=new int[n];
	
	    while(temp[i]!=arr[i]){
			if(temp[i]<arr[i])
				j++;
			else
				j--;
			
		}
		return j;
			
	}
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int res=subSequence(arr,n);
	 System.out.println(res);
		
	}
}			
			

			
		
			
			   
			   
		 
	