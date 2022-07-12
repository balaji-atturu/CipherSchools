import java.util.*;
import java.io.*;

public class Fd_2{
	public static void main(String args[]){
		//5
		//12345
		//34512
		int n=10;//01234
		int k=3;
		int arr[]={1,12,3,14,5,19,27,5,60,5};
		//int a[] =  {3,4,5,1,2};
		
		Queue<Integer> q=new ArrayDeque<>();
		//boolean flag=true;
		for(int i=0;i<n;i++)
			q.offer(arr[i]);
		int res=0;
		int r=1;
		for(int i=0;i<k;i++){
			r=q.poll();
			res=Math.max(r,res);
		}
		System.out.print(res+ " ");
		while(q.isEmpty()==false){
			r=q.poll();
			
			
			res=Math.max(res,r);
			System.out.print(res+ " ");
		}
			
		
		//System.out.println(res);
		
		
	}
}