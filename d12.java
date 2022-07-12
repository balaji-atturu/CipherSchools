import java.io.*;
import java.util.*;


public class d12 {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			int count=0;
			int res=0;
			for(int i=0;i<n;i++){
				count=0;
				for(int j=i;j<n;j=j+k){
					count=count+arr[j];
				     res=Math.max(res,count);
				}
			}
			System.out.println(res);
		}
	}
}