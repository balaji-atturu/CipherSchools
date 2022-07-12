import java.io.*;
import java.util.*;

public class pr_4{
	static String Valid(String str){
		int count=0;
		if(str.length()%2==1)
			return "No";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==')')
				count++;
			else if(str.charAt(i)=='(')
				count--;
			if(count>1)
				return "No";
		}
		if(count==0)
			return "Yes";
		else
			return "No";
	}
		
		
		
		
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		
		while(t-->0){
			String str=sc.nextLine();
			String res=Valid(str);
			System.out.println(res);
			
				
			
		}
	}
}
			
	/*int count=0;
			boolean flag=true;
			String s1=sc.next();
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)=='(')
					count--;
				else
					count++;
				if(count>1){
					System.out.println("NO");
					flag=false;
					break;
				}
				}
			if(flag==true)
				System.out.println("YES");*/				

			
			
			
			
			
			
			
	