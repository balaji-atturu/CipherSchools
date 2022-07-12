import java.util.*;
  import java.io.*;
  
  public class tar_25 {
    public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int temp[]=new int[n];
		int i=0;
		for(i=0;i<arr.length;i++)
			temp[i]=arr[i];
		Arrays.sort(temp);
		
		int ress=0;
		int h=1;
		for( int v=ress+1;v<temp.length;v++){
		if(temp[ress]==temp[v]){
			ress++;
		continue;}
		else{
			h++;
		ress++;
		}
		}
		System.out.println(h);
	
	
	for( i=1;i<temp.length;i++){
		if(temp[i]==temp[i-1])
			continue;
		int j=0;
		j=i-1;
			int z=0;
			int k=0;
			int l=0;
			int count[]=new int[n];
		for(k=0;k<arr.length;k++){
			
		
			if(temp[j]==arr[k]){
				count[z]=k;
			     z++;
				
			}
			}
	//flag++;
	
	int m=0;
		int g=0;
		int f=0;
			if(z>1){
			 m=count[1];
			 g=count[0];
			 f=m-g;
			System.out.println( temp[j]+" " +f);}
		else
			System.out.println( temp[j]+" "+"0");
		
	
		}
			
		int p=i-1;
		
		int y=0;
		int w=0;
		int s[]=new int[n];
			
		for( y=0;y<arr.length;y++){
			
			if(temp[p]==arr[y]){
				
				s[w]=y;
				w++;
			}
		}
		int c=0;
		int d=0;
		int e=0;
			if(w>1){
			 c=s[1];
			 d=s[0];
			 e=c-d;
			System.out.println(temp[p] +" " +e);}
		else
			System.out.println( temp[p]+" "+"0");
		
	
	}
  }
		
	
		
			

		