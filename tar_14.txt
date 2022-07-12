import java.io.*;
import java.util.*;
import java.lang.*;

public class tar_13{
static int left(int arr[]){
	int a=arr[0];
for(int i=1;i<arr.length;i++){
arr[i-1]=arr[i];
}
arr[arr.length-1]=a;
System.out.println();
return arr.length;
}
public static void main(String args[]){
int arr[]={1,2,3,4,5};
//int res=left(arr);
//for(int i=0;i<res;i++)
	//System.out.print(arr[i]);
int d=5;

for(int i=0;i<d;i++){
	int res=left(arr);
	for(int j=0;j<res;j++){
		System.out.print(arr[j]);
	}
}
//System.out.println(res);

}
}