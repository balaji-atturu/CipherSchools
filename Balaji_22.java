import java.util.*;
  import java.io.*;
  
  public class Balaji_22 {
    public static void main(String args[]) throws IOException {
      
      
int number,digit,sum=0;     
 Scanner sc=new Scanner(System.in);
  number=sc.nextInt();   

      while(number>0){
       digit=number%10;
sum=sum +digit;
number=number/10;

     
      }
System.out.println(sum);
    }
  }