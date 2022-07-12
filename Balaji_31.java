import java.util.*;
import java.io.*;

public class Balaji_31{
static int bsearch(int arr[],int n,int x){
int low=0,high=n-1;
while(low<=high){
int mid=(low+high)/2;
if(arr[mid]==x)
return mid;
else if(arr[mid]>x)
high=mid-1;
else
low=mid+1;
}
return -1;
}
public static void main(String args[]){
int arr[]={1,3,5,6,8,8};
System.out.println(bsearch(arr,6,8));
}
}
