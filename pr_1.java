import java.io.*;
import java.util.*;

public class pr_1{
	public static int fun(int arr[],int n){
		int temp[]=new int[n];
		
		int j=0,count=0,i=0,f=0;
		
		for(i=0;i<n;i++){
			if(temp[i]+j==arr[i])
				continue;
		else if(arr[i]>0  && j>=0){
			if(arr[i]>j){
			f=arr[i]-j;
			temp[i]=j+f;
			count=count+f;
			
			j=j+f;
			}
		    else{
				f=arr[i]-j;
			temp[i]=j+f;
			count=count+f;
			j=j-f;
			}
		}
		else if(arr[i]<0 && arr[i]>j && j<=0){
             if(arr[i]>j){
			f=arr[i]-j;
			temp[i]=j+f;
			count=count+f;
			
			j=j+f;
			}
		    else{
				f=arr[i]-j;
			temp[i]=j+f;
			count=count+f;
			j=j-f;
			}
		}
		else if(arr[i]<0 && arr[i]<j && j>=0){
			f=arr[i]-temp[i];
			temp[i]=temp[i]+f;
			count=count+f;
			j=j-f;
		}
		else if(arr[i]>0 && arr[i]>j && j<=0){
			f=arr[i]-temp[i];
			temp[i]=temp[i]+f;
			count=count+f;
			j=j+f;
				}

		}
		
				System.out.println(count);
				return j;
		}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int res=fun(arr,n);
		System.out.println(res);
				
	}
}		
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
	
		
	/*
	else {
				if(temp[i]>j && arr[i]>0){
					f=arr[i]-temp[i];
					temp[i]=temp[i]+f;
					count=count+arr[i];
					j=j+f;
				}
				else{
					f=arr[i]-j;
					temp[i]=j+f;
					count=count+f;
					j=j+f;
				}
				
			}
				}

*/	
		
	