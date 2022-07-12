import java.util.*;
import java.io.*;

public class Balaji_36{

static int fun(int arr[], int x){
int n=arr.length;
for(int i=0;i<n;i++)
if(arr[i]==x)
return i;

return -1;
}
public static void main(String args[]){
int i,j;
int arr[]={1,3,9,7,5};
System.out.println(fun(arr,15));
}
}