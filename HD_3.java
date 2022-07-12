import java.util.*;
  import java.io.*;
   public class HD_3 {
	
public static void main(String args[])throws IOException{
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
	
	 int a[]=new int[121];
	 int b[]=new int[121];
	 int j=1;
	 for(int i=17;i<121;i=i+2){
		 b[i]=j;
		 b[i+1]=j;
		 j++;
	 }
	 b[120]=j;
		 int k=0;
	 for(int i=0;i<n;i++)
		 a[arr[i]]=a[arr[i]]+1;
	 int res=0;
	 int bb=0;
	 int f=0;
	 for(int i=0;i<121;i++){
		 if(i<=16){
			 k=a[i];
			 res=res+(k*(k-1));
		 }
		 else{
			  k=a[i];
			  f=i;
			  res=res+(k*(k-1));
			  bb=b[i];
			  while(bb!=0){
				  res=res+(k*a[f-1]);
				  
				  f--;
				  bb=bb-1;
			  }
  }
	 }
	 System.out.println(res);
}
   }