import java.util.*;
import java.io.*;

public class Balaji_37{

static int fun(int arr[], int x,int pos,int cap){
int n=arr.length;
if(n==cap)
return n;
int idx=pos-1;
for( int i=n-1;i>=idx;i--)
arr[i + 1] == arr[i];

if(arr[i]==idx)
arr[i]==x;

return arr;
}
public static void main(String args[]){
int i,j;
int arr[]={1,3,5,7,9};
System.out.println(fun(arr,4,3,8));
}
}