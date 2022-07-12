import java.util.*;
import java.io.*;

public class _20{
	
	static int fun(Stack<Character> s,String s1){
		 int count=0;
		
		  for(int i=0;i<s1.length();i++){
			 
			if(s1.charAt(i)=='+' || s1.charAt(i)=='-' || s1.charAt(i)=='*' || s1.charAt(i)=='/' ){
				
				s.push(s1.charAt(i));
			}
			else if(s1.charAt(i)==')'){
				if(s.isEmpty()==true){
					count=count+1;
					return count;
				}
				else
				s.pop();
			
				
			}
		  }
		return count;	 
	}
		
		
	
	  public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  Stack<Character> s=new Stack<>();
		  String s1=sc.next();
		  int res=fun(s,s1);
		  System.out.println(res);
	  }
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
/* if(s1.charAt(i)=='+' || s1.charAt(i)=='-' || s1.charAt(i)=='*' || s1.charAt(i)=='/')
				  count++;
			  else if(s1.charAt(i)=='(')
				  s.push(s1.charAt(i));
			  else*/		 
		 