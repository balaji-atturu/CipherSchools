import java.util.*;
  import java.io.*;
  
  public class tar_19 {
   static int fun(String str){
	   int m=0;
	   int n=str.length()-1;
	int count=0;
		   while(n>m){
		   if(str.charAt(m)!=str.charAt(n)){
			   int p=(int)m;
			   int q=(int)n;
			 if(p>q){
				 while(p!=q){
					 p--;
					 count++;
			 }
			 }
				 else if(q>p){
					 while(q!=p){
						 q--;
					 count++;
					 }
				 }
				 
		   }
		   m++;
		   n--;
		   }
		   return count;
   }		 
					   
			   
	   
    public static void main(String args[]) throws IOException {
        

      Scanner sc=new Scanner(System.in);
	 
	  int qs=fun("cba");
	  System.out.println(qs);
	}
  }