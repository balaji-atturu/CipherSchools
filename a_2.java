import java.util.*;
import java.io.*;

public class a_2{

Scanner sc=new Scanner(System.in);
static int search(int arr[],int x){
int i;
for(i=0;i<arr.length;i++)
if(arr[i]==x)
return i;

return -1;
}

public static void main (String args[]){
int arr[]={1,3,15,7,9};
System.out.println(search(arr,5));

}
}