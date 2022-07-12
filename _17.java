import java.util.*;
import java.io.*;

public class _17{
	  public static int equilibriumPoint(long arr[], int n) {
		  long res=arr[0];
		  long c=0,k=0;
		  for(int i=0;i<n;i++){
		    c=c+arr[i];
		  }
		  for(int i=1;i<n-1;i++){
			  k=c-arr[i];
			  if(k-2*res==0)
				  return i+1;
			  else
				  res=res+arr[i];
		  }
		  return res;
	  }
	  

		   
	 public static void main(String args[]){
		 long arr[]={1,3,5,2,2};
		 int n=arr.length;
		long r=equilibriumPoint(arr,n);
		System.out.println(r);
	 }
}
/*
long res=arr[0];long c=0;
		 for(int i=1;i<n-1;i++){
			 c=0;
			  if(arr[i+1]==res)
				  return i+1;
			 for(int j=0;j<i;j++)
				 c=c+arr[j+i+1];
			 if(res==c)
				 return i+1;
			 res=res+arr[i];
		 }
		 return -1;
	  }
*/