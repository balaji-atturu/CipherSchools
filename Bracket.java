import java.util.*;
  import java.io.*;
  
  public class Bracket{
    //public static void main(String args[]) throws IOException {
    
	static int fun(String str){
		int c=0;
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='{')
				s.push('{');
		    else{
				if(s.isEmpty()==true){
					s.push('{');
					c++;
					}
					else
						s.pop();
				}
			}
return c;			
		
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int k=1;
	while(str.charAt(0)!='-'){
	//System.out.println(str);
	int res=fun(str);
	System.out.println(k+"."+"  "+res);
		
			str=sc.next();	
			k++;

}
      
      
    }
  }