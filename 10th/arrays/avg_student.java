package tenth;
import java.util.*;

//wap to read marks of 50 students and store them in an arra. Calculate the average marks
// Q1 pg no 197
public class avg_student {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of students");
		int num = sc.nextInt(); 
		int sum = 0;
		
		int arr[] = new int[num]; 
		
		for(int i = 0; i<num; i++) {
		// storing values from the user 
		System.out.println("Enter the marks of " + (i+1) + " student:");
		arr[i] = sc.nextInt(); 
		sum = sum+ arr[i]; 
	}
		System.out.println("The average marks are: " + (sum/num)); 
	}
		
}
	
