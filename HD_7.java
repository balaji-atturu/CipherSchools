import java.util.*;
import java.lang.*;
import java.io.*;
 public class HD_7{
	 
		 public static int print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;
  
       
  
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
  
          
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
		}
			return second;
        }
	
		 static int second(int arr[],int length){
			 if(length<=3)
				 return 0;
			 int a[]=new int[length/2 + 1];
			 int b[]=new int[length/2+1];
			 int j=0;
			 int k=0;
			 int res1=0;
			 int res2=0;
			 for(int i=0;i<arr.length;i++){
				 if(i%2==0){
					 a[j]=arr[i];
					 j++;
				 }
				 else{
					 b[k]=arr[i];
					 k++;
				 }
			 }
			 for(int i=0;i<a.length;i++){
				 res1=print2largest(a,a.length);
			 }
			 for(int i=0;i<b.length;i++){
				 res2=print2largest(b,b.length);
			 }
			 return res1+res2;
		 }
		 
		 public static void main(String args[]){
			 int arr[]={3,2,1,7,5,4};
			 int res=second(arr,arr.length);
			 System.out.println(res);
	 }
 }