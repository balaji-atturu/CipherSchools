
import java.io.*;
import java.util.*;

public class pr_2{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.nextLine());
	//sc.nextLine();
	while(t-->0){
	
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			int j=0;
			int i=0;
			for( i=j;i<s2.length();i=i+3){
				int v=s1.charAt(j);
				int vv=s1.charAt(j+1);
				int k=s2.charAt(i);
				int kk=s2.charAt(i+1);
				
				if(v==k || vv==kk){
					System.out.println("YES");
					break;
				}
			}
			if(i>s2.length())
				System.out.println("NO");
		
	}		
	}
}		
				
	
	/*
	if((v>=2 && <=9) || v==84 || v==74 || v==81 || v==75 || v==67)){
					System.out.println("YES");
				    break;
				}
				else if(vv==68 || vv=67 || vv==83 || vv==72){
					System.out.println("YES");
					break;
				}

*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
	
		
	/*
	else {
				if(temp[i]>j && arr[i]>0){
					f=arr[i]-temp[i];
					temp[i]=temp[i]+f;
					count=count+arr[i];
					j=j+f;
				}
				else{
					f=arr[i]-j;
					temp[i]=j+f;
					count=count+f;
					j=j+f;
				}
				
			}
				}

*/	
		
	
		