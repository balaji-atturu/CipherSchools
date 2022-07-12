import java.util.*;
  import java.io.*;
  
  public class a_12{
    public static void main(String args[]) throws IOException {
      
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t!=0){
    boolean flag=true;
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n-1;i++){
      arr[i]=sc.nextInt();
    }
    
    for(int i=1;i<=n;i++){
      for(int j=0;j<n-1;j++){
        if(i==arr[j]){
          flag=false;
          break;
        }

      }
      if(flag=true){
      System.out.print(i);
      }
System.out.println(flag);
    }
     
  
  t--;
  }
    }
  }