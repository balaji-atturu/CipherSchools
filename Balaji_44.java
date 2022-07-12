import java.util.*;
  import java.io.*;
  
  public class Balaji_44 {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
       
      while(t-->0){
         int n=sc.nextInt();
        int count=0;
        int i;
int f=0;
int g=0;
int r=0;
        int k=0;
        int j=0*10 + n;
        int num=0;
        int temp=0;
       while(j>0){
          j=j/10;
          temp++;
        }
temp=0*10 +temp;

        
        if(n<10)
        System.out.println(n);
        else if(n>=10 && n<100){
           
      for( i=1;i<temp;i++){
        count=10-i;
}
        System.out.println(count);
        k=n-count;
        
        num = n + k;
      
      System.out.println(num);
        }
        
        else if(n>=100 && n<1000){
 

f=n-100;
g=f*3;
r=192+ g;
System.out.println(r);
}
         
     
      
      }
    }
  }