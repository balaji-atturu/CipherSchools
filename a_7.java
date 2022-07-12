import java.io.*;
import java.util.*;

class node{
int data;
node next;
node(int x){
data=x;
}
}
public class a_7{
public static void main(String args[]){
node head=null;
head=insertBegin(head,10);
//System.out.println(head.data + " ");
head=insertBegin(head,20);
//System.out.println(head.data + " ");
head=insertBegin(head,30);
System.out.println(head.data + " ");
//printList(head);
}
static void printList(node head){
node curr=head;
while(curr!=null){
System.out.println(curr.data+" ");
curr=curr.next;
}
} 
static node insertBegin(node head,int x){

node temp=new node(x);

temp.next=head;
return temp;

}
}