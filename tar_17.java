import java.io.*;
import java.util.*;


  
  public class tar_17 {
    static void fun(int arr[],int N,int K){
      int temp[]=new int[K];
      int j=0;
      for(int i=N-1;i>=N-K;i--){
      temp[j]=arr[i];
      j++;
    }
    int m=0;
    for( m=N-1;m>=K;m--)
      arr[m]=arr[m-K];
    
    for(int i=0;i<K;i++){
    arr[m]=temp[i];
    m--;
    }
    for(int i=0;i<N;i++)
    System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) 
    { 
       
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t!=0){
       int N=sc.nextInt();
       int K=sc.nextInt();
       int arr[]=new int[N];
       for(int i=0;i<N;i++)
       arr[i]=sc.nextInt();
      fun(arr,N,K);
     
      t--; 
     }

        
    }
  }
  