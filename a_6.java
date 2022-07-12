import java.util.*;
  import java.io.*;
  
  public class a_6 {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      
       boolean flag=true;
       
       int n=4;
        int arr[]=new int[n];
       arr[0]=1;arr[1]=3;arr[2]=4;

for(int i=1;i<=n;i++){
for(int j=0;j<n-1;j++){
if(i==arr[j]){
flag=false;
break;
}
}
if(flag==true)
System.out.println(i);

}








        

        
    }
  }