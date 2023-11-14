package tenth;
import java.util.*; 


// Accepting the values of 2D array from the user and printing it out in a marix format

public class userArray2D_1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the no. of rows"); 
		int rows = sc.nextInt(); 
		System.out.println("Enter no.of columns");
		int col = sc.nextInt(); 
		
		int arr[][] = new int [rows][col]; 
		
		// accepting the values 
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<col; j++) {
				System.out.println("Enter your value"); 
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		// printing out the array in matrix format  
		
		for(int i = 0;i< rows; i++) {
			for(int j = 0; j<col; j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println(); 
		}
	}
}
	
