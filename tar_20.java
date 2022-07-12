import java.util.*;
  import java.io.*;
  
  public class tar_20 {
    static void fun(int n){
		if(n<=0)
		  return ;
      System.out.print(n + " ");
      fun(n-5);
      System.out.print((n-5) +  " ") ;
      
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        int n=sc.nextInt();
		fun(n);
		System.out.print(n);
	
		t--;
      }
    }
  }