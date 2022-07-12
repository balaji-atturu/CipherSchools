import java.io.*;
import java.util.*;


public class T_1c {
	static int removeDuplicates(int n){
		if(n<10)
			return n;
		
		int nn= removeDuplicates(n/10) + n%10;
		return nn;
			
	}
	
	public static void main(String args[]){
		
		int n=99999;
		int res=removeDuplicates(n);
		System.out.println(res);
		
	}
}