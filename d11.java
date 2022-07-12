import java.io.*;
import java.util.*;


public class d11 {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		
		int j=n-1;
		int i=0;
		boolean flag=true;
		while(arr[j]>=k/2 && arr[i]<=k/2 && i<j){
			if(arr[j]+arr[i]==k){
				System.out.println(i+" "+j);
				flag=false;
				break;
		}
		else if(arr[j]+arr[i]>k){
			j--;
			continue;
		}
		else{
			i++;
			continue;
		}
		}
		if(flag==true)
			System.out.println("no answer");
		}
	}
}
     
