import java.util.*;
import java.io.*;
  



/*char s1[]={'A','B','C'};
String s2="";
s2=s2.copyValueOf(s1);
System.out.println(s2);
String s3="";
s3=s3.copyValueOf(s1,0,3);
System.out.println(s3);
char s4[]=s2.toCharArray();
for(int i=0;i<s4.length;i++)
	System.out.print(s4[i]+" ");
int x=10;
String s6="";
String s5=s6.valueOf(s1);
System.out.println(s5);
/*The valueOf() method of the String class accepts a char or, char array or, double or, float or, int or, long or an object as a parameter and returns its String representation.*/
//StringBuilder s7=new StringBuilder("Balaji");
//String s8=s7.toString();/*UseFul when StringBuilder needs to convert to string*/
/*System.out.println(s8);
System.out.println(s8.startsWith("B"));
//ERROR System.out.println(s7.startsWith("B"));

System.out.println(s8.subSequence(1,3));
String s9=s8.substring(1,3);
System.out.println(s9);
s8=s8.concat("Reddy");
s7=new StringBuilder(s8);
System.out.println(s7);

char s10[]=new char[10];
s2.getChars(0,2,s10,0);
for(int i=0;i<s10.length;i++)
	System.out.print(s10[i]+" ");

char s11[]=new char[11];
for(int i=0;i<s11.length;i++)
	System.out.print(s11[i]+" ");//Nothing prints
*/
/*String s2="BalajiRedd";
char s10[]=new char[10];
s2.getChars(0,s2.length(),s10,0);
for(int i=0;i<s10.length;i++)
	System.out.print(s10[i]+" ");
*/
/*float a=Float.parseFloat(args[0]);


System.out.println(a);

String s2="BalajiRedd";
char s10[]=new char[10];
s2.getChars(0,s2.length(),s10,0);
for(int i=0;i<s10.length;i++)
	System.out.print(s10[i]+" ");

String s12=String.valueOf(s10);
System.out.println(s12);
*/
/*float a=Float.valueOf(args[0]);//.floatValue() or 
System.out.println(a);
int aa=10;
String s13=String.valueOf(aa);
System.out.println(aa);
*/
class Fd_1
{
    static String fun(String str){
         int count=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='H')
	        count++;
	        else if(str.charAt(i)=='T')
	        count--;
	        
	        if(count>1 || count==-1)
	        return "Invalid";
	    }
	    if(count!=0)
	    return "Invalid";
	    
	    return "valid";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    
	    
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
	while(t-->0){
	    int n=Integer.parseInt(br.readLine());
	    String str=br.readLine();
		   
		 
	   String res=fun(str);
	   System.out.println(res);
	}

	}
}

	
