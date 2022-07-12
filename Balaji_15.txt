

import java.util.*;
  import java.io.*;
  
  public class Balaji_15 {
    public static void main(String args[]) throws IOException {
      





Scanner sc =new Scanner(System.in);
int T= sc.nextInt();
while(T!=0);
{
int N=sc.nextInt();
if(N==1 || N== 4){
if(N==1)
System.out.println( N+3 +"LB");
else
System.out.println(N-3 +"LB");
}
else if(N==2 || N==5){
if(N==2)
System.out.println(  N+3 +"MB");
else
System.out.println( N-3 +"MB");
}
else if(N==3 || N==6){
if(N==3)
System.out.println( N+3 +"UB");
else
System.out.println( N-3 +"UB");
}
else if(N==7 || N==8){
if(N==7)
System.out.println( N+1 +"SU");
else
System.out.println( N-1 +"SL");
}
T--;
}
}}