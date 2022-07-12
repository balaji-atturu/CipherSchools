import java.util.*;
import java.io.*;


//Lifo
//Stack 
//ArrayDeque
//Linked List
/*Stack<Type> objName=new Stack<>(Stack Size);
push,pop,peek,search,empty,isEmpty,get,set,replace,indexOf,lastIndexOf,Size,element;
Deque objName=new ArrayDeque<Type>();
ArrayDeque<Type> objName=new ArrayDeque<>();
push same and offer,poll,peek,size,isEmpty;

	*/
public class Stack{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Stack<Integer> s=new Stack<Integer>();
s.push(1);
s.push(2);

s.push(3);
s.push(4);
s.push(5);
s.push(2);
Object arrr[]=s.toArray();
for(int i=0;i<s.size();i++)
		System.out.print(arrr[i]+" ");
/*System.out.println(s.peek());
System.out.println(s.pop());
System.out.println(s.peek());
System.out.println(s.isEmpty());
System.out.println(s.size());
System.out.println(s.get(0));
System.out.println(s.set(2,100));
System.out.println(s.get(2));
System.out.println(s.indexOf(2));
System.out.println(s.lastIndexOf(2));
System.out.println(s.peek());
System.out.println(s.size());
s.set(4,10);
System.out.println(s.peek());
for(int i:s)
System.out.println(i);	
Iterator<Integer> k=s.iterator();
while(k.hasNext()){
	System.out.println(k.next());
}
*/

	ArrayDeque<Integer> ss=new ArrayDeque<Integer>();
//offer,poll,peek,size,isEmpty	
	ss.push(10);
	ss.push(20);
	ss.push(30);
	ss.push(70);
	int arr[]=new int[ss.size()];
	int j=0;
	for(int i:ss){
arr[j]=i;
j++;
	}
	// Object[] arr = de_que.toArray();
	Object ar[]=ss.toArray();
	// System.out.println(ss.contains());
	System.out.println(ss.peek());
	System.out.println(ss.size());
	for(int i=0;i<ss.size();i++)
		System.out.print(ar[i]+" ");
	
	}
}