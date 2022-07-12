import java.util.*;
  import java.io.*;
  
  public class Balaji_40 {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int i,count=0;
        int temp=0;
        //int n=sc.nextInt();
        for( i=0;i<=2;i++){
          while(i>0){
            i=i/10;
            count++;
            temp=temp + count;
          }
        }
        System.out.println(temp);
      }
      
    }
  }