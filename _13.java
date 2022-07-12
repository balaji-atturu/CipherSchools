import java.io.*;
import java.util.*;

public class _13{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Stack<Character> s=new Stack<>();
	int n=sc.nextInt();
	int a=0,b=0; String c="";char k=0;
	
	for(int i=0;i<n;i++)
		c+=sc.next();
	
	for(int i=0;i<n;i++){
		//System.out.println(c.charAt(i));
		if(c.charAt(i)=='+' ){
			a=(int)s.pop()-'0';
			b=(int)s.pop()-'0';
	        k+=b+a;
		}
		else if(c.charAt(i)=='-' ){
			a=(int)s.pop()-'0';
			System.out.println(a);
			b=(int)s.pop()-'0';
			System.out.println(b);
	        k+=b-a;
				System.out.println(k);
		}
		else if(c.charAt(i)=='*' ){
			a=(int)s.pop()-'0';
			b=(int)s.pop()-'0';
	        k+=b*a;
		}
		else if(c.charAt(i)=='/' ){
			a=(int)s.pop()-'0';
			System.out.println(a);
			b=(int)s.pop()-'0';
			System.out.println(a);
	        k+=b/a;
			System.out.println(k);
		}
		else
			s.push(c.charAt(i));
	}
	
	System.out.println((int)k);
}
}