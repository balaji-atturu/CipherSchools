import java.io.*;
import java.util.*;

public class d1s_1{
	public static void main(String args[]){
		
		
		 
    
      Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[2*m][n];
		System.out.println(arr.length);
		for(int i=0;i<2*m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
			//System.out.println();
			//"arr" + "[" + i + " ]" + "[" + j + "]"
		}
		int i=0;
		for(i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int a=arr[i][j];
				int b=arr[m+i][j];
			System.out.print(  (a+b) + " ");
		}
			System.out.println();
			}
		
		
		for(i=i;i<2*m;i++){
			for(int j=0;j<n;j++){
				int a=arr[i-m][0];
				int b=arr[m][j];
				int d=arr[i-m][1];
				int c=arr[m+1][j];
				
				
				System.out.print((a*b)+(d*c)+" ");
			}
		System.out.println();
		}
    }
  }
		
	/* */
				