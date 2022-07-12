import java.io.*;
import java.util.*;

public class _12{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Stack<Character> s=new Stack<>();
	int count=0,b=0;
	String str=sc.next();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='{')
			s.push(str.charAt(i));
		else if(str.charAt(i)=='}'){
			if(s.isEmpty()==true){
			s.push('{');
		     count++;
			}
			else if(s.peek()=='{')
				s.pop();
			}
			}
			if(s.isEmpty()==true)
				System.out.println(count);
			else{
				b=s.size()/2;
				count=count+b;
				System.out.println(count);
			}
}
}