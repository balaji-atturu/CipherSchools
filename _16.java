import java.util.*;
import java.io.*;

public class _16{
	 public static void main(String args[]){
		 int arr[]={2,4,7,8,9,10};
		 int n=arr.length;
		 int temp=0;
		 for(int i=0;i<n-1;i++){
			 if(i%2==0){
				 if(arr[i]<arr[i+1]){
					 temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
				 }
			 }
			 else if(i%2==1){
				 if(arr[i]>arr[i+1]){
					 temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
				 }
			 }
		 }
		 for(int i=0;i<n;i++){
			 System.out.print(arr[i]);
		 }
	 }
}