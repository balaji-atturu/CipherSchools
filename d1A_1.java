import java.io.*;;
import java.util.*;

public class d1A_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[2*m][n];
		for(int i=0;i<2*m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int a=arr[i][j];
				int b=arr[m+i][j];
			System.out.print(  (a+b) + " ");
			}
			System.out.println();
			}
			

		for(int i=0;i*i<2*m;i++){
			for(int j=0;j<n;j++){
				int k=0;
				int f=m;
				int count=0;
				while(k<n && f<2*m){
					
					int res=arr[i][k]*arr[f][j];
					count=count+res;
					k++;
					f++;
				
				
			}
			System.out.print(count + " ");
		}
		System.out.println();	
		
		}
		
	}
}