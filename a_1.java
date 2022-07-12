import java.util.*;
import java.io.*;

public class a_1{
public static void main (String args[]) throws IOException{
Scanner sc=new Scanner(System.in);
int j;
int n=4;
int i;
int m=4;
int arr[][]=new int[m][n];
for( i=0;i<m;i++){
for(j=0;j<n;j++){

arr[i][j]=i * j;
System.out.print("arr[" + i + "]" +"[" + j + "]= " +arr[i][j] +" ");
}
System.out.println();
}
System.out.println(arr.length);

int marks[][]={{1,2,3,5,},{4,7,8,9},{1,2,3,6}};
for(int r=0;r<marks.length;r++){
for(int p=0;p<=marks.length;p++){
System.out.print("marks[" + r + "]" + "[" + p + "]= " +marks[r][p]+ " ");
}
System.out.println();
}
System.out.println(marks.length);

int arrr[][]=new int[m][n];
for( i=0;i<m;i++){
for(j=0;j<n;j++){

arrr[i][j]=arr[i][j];
System.out.print("arrr[" + i + "]" +"[" + j + "]= " +arrr[i][j] +" ");
}
System.out.println();
}
System.out.println(arrr.length);
//int arrr[]=new int[n];
//for(i=0;i<arr.length;i++)
//arrr[i]=arr[i];


//for(  i=0;i<arrr.length;i++){
//System.out.println("arrr[" + i  +"]:" +arrr[i]);
//}

//for( i=0;i<n;i++)




}
}
