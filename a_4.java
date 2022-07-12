import java.util.*;
import java.io.*;

public class a_4{
public static void main(String args[]){
//int[] arr=new int[10];

//for( i=0;i<arr.length;i++);
//System.out.print(arr[i]);

int n=9;

int arrr[]=new int[n];
for( int i:arrr)
System.out.println(i);

for(int i=0;i<9;i++)
arrr[i]=i*10;

for(int i=0;i<arrr.length;i++)
System.out.println(arrr[i]);
}
}