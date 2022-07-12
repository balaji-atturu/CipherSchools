import java.io.*;
import java.util.*;

class stack{
int arr[];
int cap;
int top;
stack(int c){
top=-1;
cap=c;
arr=new int[c];
}
int push(int x){
if(top==cap-1){
System.out.println("full");
return;
}
top++;
arr[top]=x;
}
int pop(){
if(top==-1){
System.out.println("empty");
return Integer.MIN_VALUE;}

int res=arr[top];
top--;
return res;
}
int peek(){
if(top==-1){
System.out.println("empty");
return Integer.MIN_VALUE;}
return arr[top];
}
int size(){
return (top+1);
}
boolean isEmpty(){
return top==-1;
}
} 


