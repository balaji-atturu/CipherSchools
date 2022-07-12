import java.util.*;
import java.io.*;

public class Fd_3{
public static void main(String args[]){
int k=3;
int j=1;
int arr[]={12,1,78,90,57,89,56,98};
Queue<Integer> q=new ArrayDeque<>();
for(int i=0;i<arr.length;i++)
q.offer(arr[i]);
int res=0;
while(q.isEmpty()!=true){
int curr=q.poll();
res=Math.max(res,curr);
if(j==3){
System.out.print(res+" ");
while(j>1){
	if(q.isEmpty()!=true){
curr=q.poll();
res=Math.max(res,curr);
System.out.print(res+" ");
if(j==2){
res=0;
j=1;
}
	}
j--;
}

}
j++;
}
}
}