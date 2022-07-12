import java.io.*;
import java.util.*;

public class _2{
	static void fun(char arr[],int i,int j){
		while(i<j){
		    char a=arr[i];
			char b=arr[j];
			arr[i]=b;
			arr[j]=a;
			i++;
			j--;
		}
		
		
	}
	static String fun1(char arr[]){
		
		int k=arr.length;
		fun(arr,k-2,k-1);
		fun(arr,0,k-3);
		fun(arr,0,k-1);
		String s4=new String(arr);
		return s4;
	}
	static String fun2(char ar[]){
		int k=ar.length;
fun(ar,0,1);
fun(ar,2,k-1);
fun(ar,0,k-1);
	String s5=new String(ar);
		return s5;
	}

			
		
	
		
			
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0){
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			
			
			if(s2.length()!=s1.length()){
				System.out.println("No");
				continue;
			}
			int kk=s1.length();
			char[] arr=new char[s1.length()];
			
			for(int i=0;i<s1.length();i++){
				arr[i]=s1.charAt(i);
			}
			String res=fun1(arr);
			if(res.equals(s2)){
				System.out.println("Yes");
				continue;
			}
			
				char ar[]=new char[s1.length()];
			
			for(int i=0;i<s1.length();i++){
				ar[i]=s1.charAt(i);
			}
			String res1=fun2(ar);
			if(res1.equals(s2)){
				System.out.println("Yes");
				continue;
			}
			System.out.println("No");
		}
	}
}