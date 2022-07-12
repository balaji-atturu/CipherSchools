import java.io.*;
import java.util.*;

public class tar_22{
	static void fun(int arr[],int N,int K){
		
		int temp[]=new int[K];
      int j=0;
      for(int i=N-1;i>=N-K;i--){
      temp[j]=arr[i];
      j++;
    }
	for(int i=0;i<temp.length;i++)
		System.out.print(temp[i]);
			System.out.println();
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	
	int m=0;
    for( m=N-1;m>=K;m--)
      arr[m]=arr[m-K];
    System.out.println();
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	
	for(int i=0;i<K;i++){
    arr[m]=temp[i];
    m--;
	
	}
	
	 
	System.out.println();
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int arr[]={1,2,3,4,5};
	fun(arr,5,4);
}
}