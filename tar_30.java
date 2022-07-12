import java.io.*;
import java.util.*;

public class tar_30{
	//static void reverse(int arr[],int l,int n){
		
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
         int i=n-1;
		
						boolean flag=true;
						int res=0;
			while(arr[i]>=k/2 ){

				int j=0;
				while(arr[j]<k/2){
				if(k-arr[i]==arr[j] ){
					if(arr[i]!=arr[i-1]){
						System.out.println(j+" "+i);
					flag=false;}
						
				else if(arr[i]==arr[i-1]) {
					for(int s=i;arr[s-1]>=k/2;s--){
						res=Math.min(s,s-1);
					}
                   System.out.println(j+" "+res);
                    flag=false;				   
					
				}
				
				
				}
				if(flag==false)
						break;
				j++;
					
				}
				if(flag==false)
						break;
				i--;
			}
			if(flag==true)
				System.out.println("no answer");
			
			
	}			
		
			
			
	}
}

					