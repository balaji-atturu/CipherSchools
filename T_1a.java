 import java.io.*;
import java.util.*;


public class T_1a {
	
		
 public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			Arrays.sort(arr);
		int count=1;
		int i=1;
		while(i<n){
			while(i<n && arr[i]==arr[i-1]){
				count++;
				i++;
			}
			if(count==k){
				System.out.println(arr[i-1]);
			break;
			}
			
			i++;
			count=1;
		}
		
				
	
			
		}
	}
}