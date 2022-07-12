import java.util.*;
  import java.io.*;
  
  public class Balaji_45 {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
       
      while(t-->0){
         int n=sc.nextInt();
       
        
int f=0;
int g=0;
int r=0;
        
      
        
        if(n<10)
        System.out.println(n);
        else if(n>=10 && n<100){
    f=n-9;
    g=f*1;
    r=n+g +0;
       System.out.println(r);} 
        else if(n>=100 && n<1000){
 

f=n-99;
g=f*2;
r=n+ g + 90 +0;
System.out.println(r);
}
else if(n>=1000 && n<10000){
  f=n-999;
  g=f*3;
  r=n + g + 900 + 990 + 0;
  System.out.println(r);
}
         else if(n>=10000 && n<100000){
           f=n-9999;
           g=f*4;
           r=n + g + 0 + 9990 + 9900 + 9000;
           System.out.println(r);
         }
     else if(n>=100000 && n<1000000){
       f=n-99999;
       g=f*5;
       r= n + g + 0 + 99990 + 99900 +99000 + 90000;
       System.out.println(r);
     }
     else if(n>=1000000 && n<10000000){
     f=n-999999;
     g=f*6;
     r=n + g + 0 + 999990 + 999900 + 999000 + 990000 + 900000;
     System.out.println(r);
     }
      
      }
    }
  }