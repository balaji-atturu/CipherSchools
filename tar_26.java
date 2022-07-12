import java.util.*;
  import java.io.*;
  
  public class tar_26 {
	  static void fun(int n,int l){
		  if(n>Math.pow(10,l))
			  return;
		  
		   boolean flag=true;
		  for(int j=n;j>0;j=j/10){
			 flag=true;
			  if(j%10==0){
				  flag=false;
			  break;
		  }
		  }
		  if(flag==true)
		  System.out.println(n);
	  
		  fun(n+1,l);
		  
	  }
    public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int n=-1;
		switch ( l){
			case 1:{
			 n=1;
			break;
			}
			case 2:{
			 n=11;
			break;
			}
			case 3:{
			 n=111;
			break;}
			case 4:{
			 n=1111;
			break;}
			
		}
		//System.out.println(n);
		fun(n,l);
	}
  }