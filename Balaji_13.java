class ThreadId extends Thread{
public void run(){
try{
System.out.println("Thread " + Thread.currentThread().getId() 
+ "is running");
}
catch(Exception e){
System.out.println("Exception is caught");
}
}
}
public class Balaji_13{
public static void main(String args[]){
int n=9;
for(int i=0;i<9;i++){
ThreadId obj=new ThreadId();
obj.start();
}
}
}