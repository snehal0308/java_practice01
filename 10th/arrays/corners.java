package tenth;
import java.util.*;

// sum of 4 corners of an array  

 public class corners {
	 public static void main(String[]args)
	 {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of rows");
		int rows = sc.nextInt(); 
		System.out.println("Enter no. of columns "); 
		int cols = sc.nextInt(); 
		int sum = 0; 
		
		int arr[][] =new int[rows][cols]; 
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.println("Enter the value"); 
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		// printing in matrix format 
		for(int i = 0; i<rows; i++) {
			for(int j  = 0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); 
		}
		System.out.println(); 
		
		// sum of corners 
		sum = arr[0][0] + arr[0][cols-1] + arr[rows-1][0] + arr[rows-1][cols-1];
		System.out.println(sum); 
		
		
	}
 }
