import java.util.*;
  import java.io.*;
  
  public class Balaji_16 {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      while(T!=0){
        int A =sc.nextInt();
        int B=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();
        int c=E-D;
        System.out.println(A+" "+B+" "+c);
        if(((B == A) || (B == D)) || ((B == c) || (B == E)))
        System.out.println("Yes");
        
       // System.out.println("Yes");
        else
        System.out.println("No");
        T--;
      }
      //write your code here
      
    }
  }