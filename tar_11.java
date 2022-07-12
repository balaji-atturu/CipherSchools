import java.io.*;
import java.util.*;
import java.lang.*;


 public class tar_11{
	 
	 public static void main(String args[]){
	String s1="A Sk";
String s2="B GH GH k";
boolean flag=true;
for(int i=0;i<s1.length();i++){
	 flag=true;
	char a=s1.charAt(i);
	
	for(int j=0;j<s2.length();j++){
		if(a==s2.charAt(j)){
			flag=false;
			
			break;
		}
		
	}
	if(flag==false)
			break;
}
	if(flag==true)
		System.out.println("No");
	else
		System.out.println("YES");
	 }
 }	 
	
	

