import java.util.*;
import java.io.*;
public class Queue2{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	Queue<Integer> q=new ArrayDeque<>();
	for(int i=0;i<n;i++){
		q.offer(arr[i]);
		for(int j=0;j<q.size();j++){
			System.out.print(q.peek()+" ");
			
	}
	System.out.println();
}
}
}
	