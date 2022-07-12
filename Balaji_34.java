import java.util.*;
  import java.io.*;
  
  public class Balaji_34 {
    public static void main(String args[]) throws IOException {
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int rows=5;
      int i,j;
      for( i=1;i<=rows;i++){
        for( j=1;j<=i;j++){
          System.out.print(j);
        }
        for(j=2*(rows-i);j>=1;j--){
          System.out.print(" ");
        }
        for(j=i;j>=1;j--){
          System.out.print(j);
        }
System.out.println();
      }
      
    }
  }