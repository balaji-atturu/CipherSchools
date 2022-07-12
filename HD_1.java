import java.io.*;
import java.util.*;
public class HD_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
         int a[]=new int[100001];
         boolean b[]=new boolean[100001];
        for(int i=0;i<a.length;i++)
			a[i]=-1;
                 
         int count=0;
         for(int i=0;i<n;i++){
           if(a[arr[i]]==-1){
           a[arr[i]]=i;
           count++;
           }
           else if(a[arr[i]]>=0 && b[arr[i]]==false){
             a[arr[i]]=i-a[arr[i]];
              b[arr[i]]=true;
		   }
			   else if(a[arr[i]]>=0 && b[arr[i]]==true){
				   int x=i-a[arr[i]];
				   if(arr[i]!=arr[x]){
					   count=count-1;
					   a[arr[i]]=Integer.MIN_VALUE;
			  }
				   
         }
		 }
          // }
		   //for(int i=0;i<a.length;i++){
			 //  if(a[i]!=-1)
			   //System.out.print(i+" "+a[i]);
		   //}
System.out.println(count);
for(int i=0;i<a.length;i++){
if(a[i]>=0 && b[i]==true)
System.out.println(i+" "+a[i]);
else if(a[i]>=0 )
System.out.println(i+" "+0);
}
}
}


    
 