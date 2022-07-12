import java.io.*;
import java.util.*;
import java.lang.*;


 

public class tar_1{
	
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
	

	int n=sc.nextInt();
	//boolean flag=true;


		for(int k=n+1;k<=9*n;k++){
			boolean flag=true;
			int i=k;;
			while(i>0){
		int a=i%10;
		//System.out.println(i);
		i=i/10;
		//System.out.println(i);
		int b=i%10;
		i=i/10;
		//System.out.println(i);
		int c=i%10;
		i=i/10;
		//System.out.println(i);
		int d=i%10;
		i=i/10;
		//System.out.println(i);
		
		
		if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
			
		flag=false;
		}
			}
		if(flag==false){
			System.out.println(k);
		
			break;
		}
		}



	//System.out.println(a + " " + b + " " +c + "  " + d);
	
}

}
}
