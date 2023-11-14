package tenth;
import java.util.*;

//wap to read marks of students and store them in an array. Find out the highest and lowest scorer
// Q2 pg no 197
public class max_min_student {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of students");
		int num = sc.nextInt(); 
		int sum = 0;
		int temp = 0 ; 
		
		int arr[] = new int[num]; 
		
		for(int i = 0; i<num; i++) {
		// storing values from the user 
		System.out.println("Enter the marks of " + (i+1) + " student:");
		arr[i] = sc.nextInt();  
	}
		// finding out the highest scorer 
		// step 1 - sort in an ascending order - using bubble sort 
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<num-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					// swap 
					temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
					
				}
			}
		}
		
		System.out.println("The highest scorer is " + arr[num-1] + " at position " + (num-1)); 
		System.out.println("The lowest scorer is " + arr[0] + " at position " + (0+1)); 
	}
		
}
	
