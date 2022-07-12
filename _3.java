import java.io.*;
import java.util.*;

public class _3{
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int r=1;
			int k=-1;
			for(int i=0;i<s.length();i++){
				int c=1;
				
				for(int j=i-1;j>=0 && j>k;j--){
					char a=s.charAt(i);
					char b=s.charAt(j);
					if(a==b)
			            k=j;
			        else
						c++;
						
					
					r=Math.max(r,c);
				}
					
					
		}
	System.out.println(r);
	}
	}
}	
		
		
		
		
	
	
	