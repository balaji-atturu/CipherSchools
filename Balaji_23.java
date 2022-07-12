import java.util.*;
import java.io.*;
  
public class Balaji_23 {
public static void main(String args[]) throws IOException {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
int N,digit,q,sum=0;
while(T!=0){
 N=sc.nextInt();

while(N>0){
digit=N%10;
if(digit==5)
sum=sum+1;

q=N/10;
}
System.out.println(sum);
T--;
}
}
}



     