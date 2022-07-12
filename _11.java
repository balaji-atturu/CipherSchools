import java.io.*;
import java.util.*;

public class _11{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int t=sc.nextInt();
	
	while(t-->0){
		int count=0,res=0;
		Stack<Character> ss=new Stack<>();
		int n=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='<'){
				ss.push(s.charAt(i));
				count++;
			}
			else if(s.charAt(i)=='>'){
				if( ss.isEmpty()==false && ss.peek()=='<'){
                         ss.pop();
						 count--;
				}
					 else{
						 ss.push(s.charAt(i));
						 count++;
					 }
            }
            if(count==0)
              res=i+1;				
		}
		System.out.println(ss.size());
		
			System.out.println(res);
		
			//System.out.println();
		
	}
}
}
	
	
	
	