import java.io.*;
import java.util.*;

public class tar_23{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[2*m][n];
		//System.out.println(arr.length);
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
			//System.out.println();
			}
			System.out.println();
			}
		//System.out.print(i);
				for(i=i;i<2*m;i++){
			for(int k=0;k<n;k++){
				int z=arr[i-m][0];
				int y=arr[m][k];
				int x=arr[i-m][1];
				int v=arr[m+1][k];
				
				System.out.print((z*y) + (x*v) + " " );
			}
		System.out.println();
		}
		//System.out.println(arr.length);
	}
}