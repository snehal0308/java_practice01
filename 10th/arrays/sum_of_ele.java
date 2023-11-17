package tenth;
import java.util.*;

// add all ele of an array and print in matrix format 
public class sum_of_ele {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of rows"); 
		int rows= sc.nextInt(); 
		System.out.println("Enter no. of columns");
		int cols = sc.nextInt(); 
		
		int arr[][] = new int[rows][cols]; 
		int sum = 0;
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// printing out in matrix format 
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(); 
		}
		
		// adding all ele of an array 
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				sum+= arr[i][j];
			}
		}
		System.out.println(sum); 
	}
	
	}
