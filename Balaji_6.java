import java.util.*;
import java.io.*;

class Balaji_6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t!=0){
int n=sc.nextInt();
if((n%2==0) || (n%3==0)){
System.out.println("not prime");
}
else
System.out.println("prime");
}
}
}