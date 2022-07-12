import java.io.*;
import java.util.*;

public class p_1{
	
		static	String Cards(String s,String s1){
			String flag="NO";
			int j=0;
			for(int i=0;i<s1.length();i=i+3){
				if((int)s.charAt(j)==(int)s1.charAt(i)){
					System.out.println(s.charAt(j)+ " " +s1.charAt(i));
					flag="YES";
					break;
				}
			}
			int k=1;
			if(flag=="NO"){
				for(int i=1;i<s1.length();i=i+3){
				if((int)s.charAt(k)==(int)s1.charAt(i)){
					flag="YES";
					break;
				}
			}
			}
	
		return flag;
	}
	public static void main(String args[]){
		
			
			Scanner sc=new Scanner(System.in);
			//int t=sc.nextInt();
			
			String s=sc.nextLine();
			String s1=sc.nextLine();
			
			
		String res=Cards(s,s1);
		System.out.println(res);
		
		
			
	}
	}