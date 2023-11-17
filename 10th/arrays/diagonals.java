package tenth;
import java.util.*;

// sum of diagonals 

 public class diagonals {
	 public static void main(String[]args)
	 {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter no. of cols ");
		
		int cols = sc.nextInt(); 
		
		int sumR = 0 , sumL = 0; 
		
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
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				if(i==j) 
					sumR += arr[i][j]; 
				if (i+j == cols-1 ) 
					sumL = sumL + arr[i][j];
				}
		}
		System.out.println("Sum of right diagonal is" + sumR); 
		System.out.println("Sum of left diagonal is" + sumL); 
		
		
		
	}
 }
