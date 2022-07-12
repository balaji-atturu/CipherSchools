import java.util.*;
import java.io.*;

public class raki_4 {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      int arr[]={1,2,3,4,5};
     int temp=arr[(arr.length)-1];
int n=arr.length;
for(int i=n-1;i>0;i--){
arr[i]=arr[i-1];
}
arr[0]=temp;


  int temp1=arr[(arr.length)-1];

for(int i=n-1;i>0;i--){
arr[i]=arr[i-1];
}
arr[0]=temp1;
for(int i=0;i<n;i++){

     System.out.print(arr[i]);
}
}
}