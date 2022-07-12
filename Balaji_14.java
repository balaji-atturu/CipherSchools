import java.io.*;
public class Balaji_14{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("D:/java/test.txt");
fout.write(65);
fout.close();
System.out.println("file writing is over");
}
catch(Exception e)
{

System.out.println( e);
}
}
}