import java.util.*;
  import java.io.*;
  
  public class HD_2 {
     static int fun(String s1,String s2){
	       StringBuilder s=new StringBuilder(s1);
	       StringBuilder s3=new StringBuilder(s2);
	      int res=0;
	       for(int i=0;i<s.length();i++){
	          s.append(s.charAt(0));
	 res++;
	int a=0;
	        s= s.deleteCharAt(0);
			String s19=s.toString();
		if(s19.equals(s2))
	         break;
	         }
		 StringBuilder s4=new StringBuilder(s1);
	       StringBuilder s5=new StringBuilder(s2);
	       int count=0;
	        for(int i=0;i<s5.length();i++){
	        s5.append(s5.charAt(0));
count++;
		 int a=0;
	        s5= s5.deleteCharAt(0);
			String s9=s5.toString();
		if(s9.equals(s1))
	         break;
	        }
		int l=Math.min(res,count);
			 if(l<s.length())
			  return l;
			 else
				  return -1;
		 
   }	
   static int f(String s20[]){
     int v=0;
     for(int i=0;i<s20.length-1;i++){
       int c=fun(s20[i], s20[i+1]);
         if(c==-1)
         return c;
         else
         v=v+c;
       
     }
     return v;
   }
    public static void main(String args[]) throws IOException {
      
   
      Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
     String s20[]=new String[n];
     for(int i=0;i<n;i++)
     s20[i]=sc.next();
     int q=f(s20);
    System.out.println(q);
      }
    }
  }
		/* public static void main(String args[]){
		StringBuilder br=new StringBuilder("Java");
		
		System.out.println(br.length());
			br.append(br.charAt(0));
			System.out.println(br.length());
		br.deleteCharAt(0);
		
		System.out.println(br.length());
		System.out.println(br);*/