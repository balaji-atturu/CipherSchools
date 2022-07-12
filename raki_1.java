import java.io.*;
import java.util.*;


public class raki_1 {
   public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        boolean flag=true;
       
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++)
        arr[i]=sc.nextInt();
        
        int count=n*(n+1)/2;
        int temp=0;
        for(int i=0;i<n;i++){
          temp=temp+ arr[i];
        }
        int r=count-temp;
        System.out.println(r);
       
       t--; 
}
      }
    }