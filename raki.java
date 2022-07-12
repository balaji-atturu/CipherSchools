import java.io.*;
import java.util.*;
public class raki{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int k=0;
      int s=0;
      int q=0;
      int w=0;
      int f=0;
      int g=0;
      while(t!=0){
        
        boolean flag=true;
        String str=sc.next();
        for(int i=0;i<str.length();i++){
          k=str.charAt(i);
          s=(int)k;
          f=s-97;
          if(f==0 || f==4 || f==8 || f==13 || f==14 ||f==20)
            continue;
          
          else{
            q=str.charAt(i + 1);
          w=(int)q;
          g=w-97;
          if(g==0 || g==4 || g==8 || g==14 || g==20)
          continue;
          else{
          flag=false;
          break;
          }
          }
          
        }
        if(flag==true)
        System.out.println("YES");
        else
        System.out.println("NO");
        t--;
      }
}
}