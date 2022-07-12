import java.util.*;
  import java.io.*;
  
  public class raki_5 {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
    int arr[]={4,3,5,2,1};
int n=arr.length;
        int count[]=new int[n];
        
        int i=0; int j=0;
         if(arr[i]>arr[i+1]){
        count[j]=i;
        j++;
        
      }
//System.out.println(j);

    
        for(int s=0;s<j;s++){
System.out.println(count[s]);
}
        
       
    for(int k=i + 1;k<n-1;k++){
         if(arr[k]>arr[k+1] && arr[k]>arr[k-1]){
          count[j]=k;
          j++;
          
         
        }
  
    }
  }
        
        