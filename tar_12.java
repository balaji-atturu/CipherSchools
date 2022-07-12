import java.io.*;
import java.util.*;
import java.lang.*;


 public class tar_12{
	 
	 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 int t=2;
	 while(t!=0){
	 int res=0;
	 String s1=sc.next();
	 int c=s1.length();
	 for(int i=0;i<c;i++){
	 char a=s1.charAt(i);
	 if(a=='a')
	 res++;
	 }
	 if(res>=(c/2)+1)
	 System.out.println(c);
	 else
	 System.out.println((res -1) + res);
 t--;
	 }
	 
	 }
	 }
	 