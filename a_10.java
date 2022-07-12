import java.io.*;
import java.util.*;

class node{
int data;
node next;
node prev;

node(int x){
data=x;
}
}
public class a_10{
static void printList(node head){
node curr=head;
while(curr!=null){
System.out.println(curr.data+" ");
curr=curr.next;
}
}
static node insertEnd(node head,int data){



}
public static void main(String args[]){
node head=new node(10);
node temp=new node(20);
node temp1=new node(30);
head.next=temp;
temp.prev=head;
temp.next=temp1;
temp1.prev=temp;
printList(head);
//System.out.println(temp1.prev.data+" ");
}
}



