import java.util.*;
import java.io.*;

public class _15{
	 public static void main(String args[]){
		 int l[]={2,1,3};
		 int r[]={5,3,9};
		 int aq[]=new int[100000];
		for(int i=0;i<l[i];i++){
           int a = l[i];
           int b = r[i];
           while(a<=b){
               aq[a]++;
               a++;
           }
       }
		 int res=0;
		 for(int i=1;i<aq.length;i++){
			 if(aq[res]<aq[i])
				 res=i;
		 }
		 System.out.println(aq[res]);
	 }
}