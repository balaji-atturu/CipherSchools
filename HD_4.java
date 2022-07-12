import java.util.*;
  import java.io.*;
  
  public class HD_4 {
    public static void main(String args[]) throws IOException {
      
     
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	    int max=arr[0];
		int s=arr[0];
		for(int i=1;i<k;i++){
			if(arr[i]>=max){
				s=max;
				max=arr[i];
			}
			else if(arr[i]>s)
				s=arr[i];
		}
		System.out.println(max +  " " + s);
		
		
		
	
		
	}
}
  