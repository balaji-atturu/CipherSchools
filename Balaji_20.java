import java.util.*;
  import java.io.*;
  
  public class Balaji_20 {
    public static void main(String args[])  {
      
      Scanner sc=new Scanner(System.in);
      
      int T=sc.nextInt();
      while(T!=0){
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
       
        int d=sc.nextInt();
        int e=sc.nextInt();
        int c=e-d;
        if(b==d || b==e)
        System.out.println("YES");
        else
        System.out.println("No");
        
        System.out.println(a +" " + b +" "+ c);
        T--;
      }
      catch(Exception e){
        System.out.println(e);
      }
        
      }
      
      
    }
  }