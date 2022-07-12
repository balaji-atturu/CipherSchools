import java.io.*;
import java.util.*;

public class _10{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Stack<Integer> s=new Stack<>();
	Stack<Integer> ss=new Stack<>();
	int t=sc.nextInt();
	while(t-->0){
		int a=sc.nextInt();
		int b=1;
		//int c=Integer.MAX_VALUE;;
		int res=1,c=1,k=1,kk=1,l=1;
         if(a==1){
			 b=sc.nextInt();
			 //c=Math.min(b,c);
		     s.push(b);
			 if(ss.size()<1)
			 ss.push(b);
			 else
			 {  
		        if(ss.peek()<b){
					res=ss.peek();
					ss.pop();
					ss.push(b);
					ss.push(res);
					//ss.set(ss.peek(),b);
					//ss.push(res);
				}
				else
				ss.push(b);
				 }
		 }
              	 
			  				
			
		 else if(a==2){
			 if(s.isEmpty()==false){
				 res=s.pop();
				//System.out.println(res);
				 
				 if(res==ss.peek())
					 ss.pop();
				 else{
				   c=ss.indexOf(res);
				   ss.remove(c);
				 }
			 }
			else{
				res=-1;
				System.out.println(res);
			}
		 }
		 else if(a==3){
			 if(s.isEmpty()==false){
				 res=s.peek();
				 System.out.println(res);
			 }
			 else{
				 res=-1;
				System.out.println(res);
				 
			 }
		 }
		 else if(a==4){
			 if(ss.isEmpty()==false){
				 res=ss.peek();
				 System.out.println(res);
			 }
               else{
                 	 res=-1;
				System.out.println(res);
				 
			 }
		 }			 
		
	}
}
}
/*
 c=ss.indexOf(res);
				 k=ss.get(c);
				 ss.set(k,ss.peek());
				 kk=ss.peek();
				 ss.set(ss.peek(),k);
				 ss.pop();
				 if(ss.peek()!=kk){
					 l=ss.peek();
					 ss.set(ss.peek(),kk);
					 ss.set(c,l);
				 }*/
