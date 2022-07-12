import java.io.*;
import java.util.*;

class node{
int data;
node next;
node(int x){
data=x;
}
}
public class a_9{
static void printList(node head){
node curr=head;
while(curr!=null){
System.out.println(curr.data+" ");
curr=curr.next;
}
}
static node insertEnd(node head,int x){
node temp=new node(x);
if(head==null)
return temp;

node curr=head;
while(curr.next!=null){
curr=curr.next;
}
curr.next=temp;
return head;
}

public static void main(String args[]){
node head=null;
head=insertEnd(head,10);
head=insertEnd(head,20);
head=insertEnd(head,30);
printList(head);
}
}