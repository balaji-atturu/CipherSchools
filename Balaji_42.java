import java.util.*;
import java.io.*;
 public class Balaji_42{
public static int insert(int arr[],int x, int pos,int n,int cap){

if(n==cap)
return n;

int idx=pos-1;
int i;
for(i=n-1;i>=idx;i--)
arr[i+1]=arr[i];

arr[idx]=x;
return n+1;
}
public static void main(String args[]){
int arr[]=new int[8];
arr[0]=2;arr[1]=3;arr[2]=5;arr[3]=7;arr[4]=9;
int x=6;
int pos=3;
int cap=8;
int n=5;
for(int i=0;i<n;i++)
System.out.print(arr[i]);

System.out.println();

n=(insert(arr,x,pos,n,cap));
for(int i=0;i<n;i++)
System.out.print(arr[i]);
}
}


