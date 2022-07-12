import java.util.*;
  import java.io.*;
  
  public class tar_24 {
    public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int temp[][]=new int[m][n];
		int j=0;
   for(int i=0;i<m;i++){
			for( j=0;j<n;j++){
				temp[i][j]=arr[i][j];
	}
	
  }
		
		for(int i=0;i<m;i++){
			for(j=0;j<n;j++){
				while(j>i&& j<n){
					arr[i][j]=0;
					j++;
				}
	}
  }
  
  
   j=0;
		for(int i=0;i<m;i++){
			for(j=0;j<n;j++){
				while(j<i&& j<n){
					temp[i][j]=0;
					j++;
				}
	}
  }
  for(int i=0;i<m;i++){
			for( j=0;j<n;j++){
				System.out.print(arr[i][j]);
	}
	System.out.println();
  }
  for(int i=0;i<m;i++){
			for( j=0;j<n;j++){
				System.out.print(temp[i][j]);
	}
	System.out.println();
  }
	}
  }