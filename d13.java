import java.io.*;
import java.util.*;


public class d13 {
	static int Floor(int arr[],int n,int x){
		int low=0;
		int high=n-1;
		int res=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return mid;
			
			else if(arr[mid]<x){
				
				low=mid+1;
				res=mid;
				
			}
			else{
				high=mid-1;
			}
		}
			return res;
		}
				
				
			
		
		
		
		
		

    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int x=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			
			int f=Floor(arr,n,x);
			System.out.println(f);
		}
	}
}