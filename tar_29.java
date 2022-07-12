import java.io.*;
import java.util.*;

public class tar_29{
	
	
	
	public static void main(String args[]){
			
					
			
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
			while(t!=0){
		 int n=sc.nextInt();
		
		 int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		
		int j=0;
		int z=0;
		int c=0;
		int[] count=new int[n];
		while(j<n-1){
			for(int i=j+1;i<n;i++)
				if(k-arr[j]==arr[i]){
					count[z]=arr[j];
				    z++;
					count[z]=arr[i];
					z++;
					c++;
				}
				
				j++;
			}
			if(z>0){
			int g=0;
			int i=1;
			for( i=1;i<z;i++)
				if(count[g]<count[i])
					g=i;
			
			int hm=count[g];
			int hm1=count[g-1];
			
		     for(i=0;i<n;i++)
				 if(arr[i]==hm ||  arr[i]==hm1)
System.out.print(i+" ");	
			 
				System.out.println();
			}
				else
					System.out.println("no answer");
				t--;
			}
		
	}
}

			

			
		
		