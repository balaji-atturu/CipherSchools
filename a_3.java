import java.util.*;
import java.io.*;

public class a_3{

Scanner sc=new Scanner(System.in);
static int insert(int arr[],int x,int pos,int cap,int n){
if(n==cap)
return n;


int idx=pos-1;
for(int i=n-1;i>=idx;i--)
arr[i+1]=arr[i];

arr[idx]=x;

return n+1;
}
public static void main(String args[]){
int arr[]=new int[5],n=3,cap=5;
arr[0]=5;arr[1]=6;arr[2]=8;

for(int i=0;i<n;i++)
System.out.println(arr[i]);
int x=6, pos=2;
n=insert(arr,x,pos,cap,n);
for(int i=0;i<n;i++)
System.out.println(arr[i]);
}
}