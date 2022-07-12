import java.util.*;
import java.io.*;

 class Balaji{
int x;
int k;
 public int fun(){
System.out.println("He");
return 2;
}
}
interface anInterface{
int z=100;
int fun1();
}
class Balaji_1 extends Balaji implements anInterface{
 public int fun1(){
System.out.println("Heelo");
return 1;}
}
 public class Balaji_11{
public static void main(String args[]){
Balaji_1 obj=new Balaji_1();
obj.fun();
obj.fun1();
obj.k=13;
System.out.println(obj.k);
}
}
