import java.util.*;
import java.io.*;
 public class Balaji_43{
public static int insert(int arr[],int x,int n){




int i;
for(i=0;i<n;i++){
if(arr[i]==x);
break;}

if(i==n)
return n;
for(int j=i;j<n-1;j++)
arr[j]=arr[j+1];
return n-1;
}
public static void main(String args[]){
int arr[]={2,3,5,7,9};

int x=5;


int n=5;
for(int i=0;i<n;i++)
System.out.print(arr[i]);

System.out.println();

n=insert(arr,x,n);
for(int i=0;i<n;i++)
System.out.print(arr[i]);
}
}


