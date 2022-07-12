import java.io.*;
import java.util.*;

public class _1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int temp[]=new int[n];
		int i=0,j=0;
		long c=0L;
		c=j;
		int k=0;
		for(i=0;i<n;i++){
			if(arr[i]==j)
				continue;
			else{
				k=arr[i]-j;
				j=j+k;
				temp[i]=j;
				if(k<0)
					c=c-k;
				else
					c=c+k;
			}
		}
		System.out.println(c);
		
		
	}
}
			
/*
if(arr[i]==j){
				temp[i]=j;
				k=arr[i-1]-arr[i];
				if(k<0)
				c=c-k;
			else
				c=c+k;
				continue;
			}
				
			k=arr[i]-j;
			j=j+k;
			temp[i]=j;
			if(k<0)
				c=c-k;
			else
				c=c+k;
	





			if(arr[i]<j)
				continue;
if(arr[i]==j){
				temp[i]=j;
				
				continue;
			}
				
			k=arr[i]-j;
			j=j+k;
			temp[i]=j;
			if(k<0)
				c=c-k;
			else
				c=c+k;
		
		}
		j=arr[0];
		for( i=1;i<n;i++){
		
			if(arr[i]>arr[0])
				continue;
			
			
			k=arr[i-1]-arr[i];
			j=arr[i-1]-k;
			temp[i]=j;
			if(k<0)
				c=c-k;
			else
				c=c+k;
		}
		System.out.println(c);
		
	}
	
}	
*/