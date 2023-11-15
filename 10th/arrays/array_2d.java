package tenth;
import java.util.*;

// wap to create a 2D arrays from  user input and show it in matrix format 
// Q6 pg 197

public class array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns"); 
        int cols = sc.nextInt(); 
        int arr[][] = new int [rows][cols];
        
        for(int i = 0; i<rows; i++) {
        	for(int j = 0; j<cols; j++) {
        		System.out.println("Enter the value"); 
        		arr[i][j] = sc.nextInt(); 
        		
        	}
        }
        
        // printing out in matrix formatb
        for(int i = 0; i<rows; i++) {
        	for(int j = 0; j<cols; j++) {
        		
        		System.out.print(arr[i][j]); 
        		
        	}
        	System.out.println(); 
        }
        
        

        sc.close();
    }
}
