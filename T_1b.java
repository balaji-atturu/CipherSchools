import java.io.*;
import java.util.*;


public class T_1b {
	static int maximum(int n,int k){
		int res=0;
		int low=0;
		int high=n;
		
		int r=0;
		int kk=0;
		while(low<=high){
			int mid=(low+high)/2;
			if(mid==1)
				r=0;
			else
			 r=((mid-1)*(mid-1)+1+1)/2;
			kk=5*r;
			System.out.println(r);
				System.out.println(kk);
			if((5*mid + kk)==(240-k))
				return mid;
			else if((5*mid + kk)>(240-k))
				high=mid-1;
				
			
			else{
				
				low=mid+1;
				
				res=mid;
			}
		}
			return res;
		
		
	}
		
 public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int k=sc.nextInt();
			int ans=maximum(n,k);
			System.out.println(ans);
					
					
				
			
			
		}
 }