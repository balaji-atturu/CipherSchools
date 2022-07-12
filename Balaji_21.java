import java.util.*;
  import java.io.*;
  
  public class Balaji_21 {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        int price;
        int q1=sc.nextInt();
        int t1=sc.nextInt();
        int q2=sc.nextInt();
        int t2=sc.nextInt();
        int q3=sc.nextInt();
        int t3=sc.nextInt();
        System.out.println(q1 +" "+t1);
        System.out.println(q2+" "+t2);
        System.out.println(q3+" "+t3);
        
        if(q1>100)
        System.out.println((q1*t1)-(20*q1*t1/100));
        else
        System.out.println(q1*t1);
      
      if(q2>100)
        System.out.println((q2*t2)-(20*q2*t2/100));
        else
        System.out.println(q2*t2);
      
      if(q3>100)
        System.out.println((q3*t3)-(20*q3*t3/100));
        else
        System.out.println(q3*t3);
      
      t--;
      }
      
      
    }
  }