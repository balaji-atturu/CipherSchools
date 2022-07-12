import java.util.*;
import java.io.*;
import java.lang.*;
  
class GFG
{ public static void main(String[] args){
    String str="geeksforgeeks";
    int[] count=new int[26];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)-'a']++;
    }
    for(int i=0;i<26;i++){
        if(count[i]>0){
            System.out.println((char)(i+'a')+" "+count[i]);
        }
    }
}
} 

question2 
import java.util.*;

class GFG {
    
    static boolean isSubSeq(String s1, String s2, int n, int m){
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j))
            j++;
        }
        
        return j == m;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		System.out.println(isSubSeq(s1, s2, n, m));
		
	}
}

question 3
class GFG { 
  
    static boolean areAnagram(String s1, String s2) 
    { 
       
        if (s1.length() != s2.length()) 
            return false; 
  
       char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        
        return s1.equals(s2);
    } 
  
    public static void main(String args[]) 
    { 
        String str1 = "abaac"; 
        String str2 = "aacba";  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 
3.2)
class GFG { 
    
    static final int CHAR=256;
        
    static boolean areAnagram(String s1, String s2) 
    { 
       
        if (s1.length() != s2.length()) 
            return false; 
  
       int[] count=new int[CHAR];
    for(int i=0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
    
    for(int i=0;i<CHAR;i++){
        if(count[i]!=0)return false;
    }
    return true;
    } 
  
    public static void main(String args[]) 
    { 
        String str1 = "abaac"; 
        String str2 = "aacba";  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 
question 4.
class GFG { 
        
    static int leftMost(String str) 
    {
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j))return i;
        }
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 

4.1
class GFG { 
        static final int CHAR=256;
    static int leftMost(String str) 
    {
    int[] count=new int[CHAR];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]>1)return i;
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 
4.2
class GFG { 
        static final int CHAR=256;
    static int leftMost(String str) 
    {
    int[] fIndex=new int[CHAR];
    Arrays.fill(fIndex,-1);
    int res=Integer.MAX_VALUE;
    for(int i=0;i<str.length();i++){
        int fi=fIndex[str.charAt(i)];
        if(fi==-1)
        fIndex[str.charAt(i)]=i;
        else
        res=Math.min(res,fi);
    }
    
    return (res==Integer.MAX_VALUE)?-1:res;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 
4.3
class GFG { 
        static final int CHAR=256;
    static int leftMost(String str) 
    {
    boolean[] visited=new boolean[CHAR];
    int res=-1;
    for(int i=str.length()-1;i>=0;i--){
        if(visited[str.charAt(i)])
        res=i;
        else
        visited[str.charAt(i)]=true;
    }
    
    return res;
    
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 
} 

question 5
class GFG { 
       
    static int nonRep(String str) 
    {
    for(int i=0;i<str.length();i++){
        boolean flag=false;
        for(int j=0;j<str.length();j++){
            if(i!=j&&str.charAt(i)==str.charAt(j)){
                flag=true;
                break;
            }
        }
        if(flag==false)return i;
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));  
    } 
} 
5.1
class GFG { 
       static final int CHAR=256;
    static int nonRep(String str) 
    {
    int[] count=new int[CHAR];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]==1)return i;
    }
    return -1;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));  
    } 
} 
5.3
class GFG { 
       static final int CHAR=256;
    static int nonRep(String str) 
    {
    int[] fI=new int[CHAR];
    Arrays.fill(fI,-1);

    for(int i=0;i<str.length();i++){
        if(fI[str.charAt(i)]==-1)
        fI[str.charAt(i)]=i;
        else
        fI[str.charAt(i)]=-2;
    }
    int res=Integer.MAX_VALUE;
    for(int i=0;i<CHAR;i++){
        if(fI[i]>=0)res=Math.min(res,fI[i]);
    }
    return (res==Integer.MAX_VALUE)?-1:res;
    } 
  
    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));  
    } 
} 

6
class GFG { 
       
    static void reverse(char str[],int low, int high){
    while(low<=high){
        //swap
        char temp=str[low];
        str[low]=str[high];
        str[high]=temp;
        //
        low++;
        high--;
    }
    }

    static void reverseWords(char str[],int n){
    int start=0;
    for(int end=0;end<n;end++){
        if(str[end]==' '){
            reverse(str,start,end-1);
            start=end+1;
        }
    }
    reverse(str,start,n-1);
    reverse(str,0,n-1);
    }
  
    public static void main(String args[]) 
    {   String s = "Welcome to Gfg";int n=s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(str,n);
        System.out.println(str);  
    } 
} 