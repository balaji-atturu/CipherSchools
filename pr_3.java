import java.io.*;
import java.util.*;

public class pr_3{
	
	public static void main(String args[]){
		  Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        String str=sc.next();
		int b=0;
		int e=str.length()-1;
		int c=0;
		int count=0;
		while(b<e){
			int a=(int)str.charAt(b);
			int aa=(int)str.charAt(e);
			if(a>aa){
				c=a-aa;
				count=count+c;
			}
			else{
				c=aa-a;
				count=count+c;
			}
			b++;
			e--;
		}
		System.out.println(count);
		
		t--;
	  }
	}
}