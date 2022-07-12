import java.util.*;
import java.io.*;
public class Queue1{
public static void main(String args[]){
/*
When to use
fifo, First in First Out 
Arrays,LinkedList,Queue,Dequeue
enqueue at rear,dequeue at front,get Front,get Rear, size,isEmpty.
offer,poll,size,isEmpty,peek();
Use Arrays for Creation and LinkedList
*/
Deque<Integer> q=new ArrayDeque<>();
q.offer(1);
q.offer(2);
q.offer(3);
q.offer(4);
q.offer(5);
System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q.peek());
System.out.println(q.size());
System.out.println(q.isEmpty());
System.out.println(q.getFirst());
System.out.println(q.getLast());
q.offerFirst(10);
q.offerLast(100);
System.out.println(q.getFirst());
System.out.println(q.getLast());
System.out.println(q.size());
for(int i:q)
	System.out.print(i+" ");
Object arr[]=q.toArray();
Deque<Object> qq=new ArrayDeque<>();
for(int i=0;i<arr.length;i++){
	qq.offer(arr[i]);
}
	for(int i:q)
	System.out.print(i+" ");
}
}
	
	
		