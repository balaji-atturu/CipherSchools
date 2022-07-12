import java.io.*;
import java.util.*;

class node{
int data;
node next;

node(int x){
data=x;
}
}
public class a_8{
public static void main(String args[]){
node head=new node(10);
head.next=new node(20);
head.next.next=new node(30);
printList(head);
}
static void printList(node head){
node curr=head;

while(curr!=null){
System.out.println(curr.data + " ");
curr=curr.next;
}

}
}