import java.util.*;
import java.io.*;
 

public class Bala_1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t1=1,c1=2;
int t2=2,c2=4;
int t3=5,c3=6;
int t4=6,c4=10;
int count=0;
if(c1-t1>=2){
count++;
if(c1-t2>=2)
count++;
if(c3-t3>=2)
count++;
if(c4-t4>=2)
count++;
System.out.println(count);
}
}
}
