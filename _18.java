import java.util.*;
import java.io.*;

public class _18{
	  public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   /*String s="balaji";
	   String s2="balaji";
	   s="Bala";
	   System.out.println(s2);
	   String sr=new String(s);
	   StringBuilder s1=new StringBuilder(sr);
	   System.out.println(s1);
	   //String s4=new String(s1);
	   //char[] arr=s4.toCharArray();
	   //for(int i=0;i<s4.length();i++){
	   //System.out.println(arr[i]);}
	   char arr[]=new char[s1.length()];
	   for(int i=0;i<s1.length();i++)
		   arr[i]=s1.charAt(i);
		   
		   for(int i=0;i<s1.length();i++){
	   System.out.println(arr[i]);}
	   
	   char a[];
	   a=new char[4];
	   a[0]='a';
	   a[1]='b';
	   a[2]='c';
	   a[3]='d';
	   String s5=new String(a);
	   String s6=new String();
	   char ar[]={'b','c','s'};
	   for(int i=0;i<ar.length;i++){
		   char aa=arr[i];
		     System.out.println(s6);
		   s6=String.valueOf(aa);
		   s6+=s6;
	   }
	   System.out.println(s6);
	 s6=String.valueOf(ar);
	   String s7=ar.toString();
	    // StringBuilder s7=new StringBuilder(a);
	   
//System.out.println(s5);
System.out.println(s6);
//System.out.println(s7);
	   
		  
	*/
/*char ar[]={'a','b','c'};
String s=ar.toString();
String s1=String.valueOf(ar);
String s2=new String(ar);
String s3=new String();
s3=String.valueOf(ar);
System.out.println(s);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);	
*/
String s="Balaji";
String s1=new String("Bala");

StringBuffer s3=new StringBuffer("LPU");
StringBuilder s4=new StringBuilder("Concat");


System.out.println(s);
System.out.println(s1);
System.out.println(s3);
System.out.println(s4);
	
char[] a=s.toCharArray();
char[] b=s1.toCharArray();
for(int i=0;i<a.length;i++){
	a[i]='a';
}
for(int i=0;i<b.length;i++){
	System.out.println(b[i]);
}
char[] aa=new char[s4.length()];
for(int i=0;i<s4.length();i++)
	aa[i]=s4.charAt(i);
for(int i=0;i<aa.length;i++){
	System.out.println(aa[i]);
}
s=new String(a);
System.out.println(s);
s=s.concat("balajiii");
s=s.concat("b");
s3=s3.append("bbbbb");
System.out.println(s3);
  }
}
/*
replace
contains
indexOf
length
charAt
toCharArray
String.valueOf
toLowerCase
upper
compareTo
compareToIgnoreCase
