import java.io.*;
import java.util.*;
 

public class raki_2 {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      //Scanner sc=new Scanner(System.in);
      //int n=sc.nextInt();
int arr[]={1,3,4,5,7,9};
int count[]=new int[10];
int j=0;
for(int i=0;i<arr.length;i++){
if(arr[i]%2!=0){
//System.out.println(arr[i]);
count[j]=arr[i];
j++;
}
}
for(int i=0;i<count.length;i++){
System.out.println(count[i]);
}
}
}