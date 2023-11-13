package tenth;
import java.util.*; 


// basic bubble sort 

public class array1 {
	
	// creating a function to print the array 

	public static void printArray(int arr[]) { // remember to make this func static 
		int len = arr.length ; 
		for(int i = 0; i <=len-1; i++) {
		System.out.println(arr[i]); 
	}
	}
	// static method - The static keyword is used to construct methods that will 
	// exist regardless of whether or not any instances of the class are generated.
	
	public static void main(String[]args) {
		
		int arr[] = {1,6,7,2,5}; 
		
		int len = arr.length; 
		for(int i = 0; i<len-1; i++) {
			for(int j = 0; j<len-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					// swap
					int temp = arr[j]; // stores the previous value 
					arr[j] = arr[j+1]; // this means j+1 is now empty 
					arr[j+1] = temp; // storing the temp value in j+1 as you cant keep it empty
					
				}
			}
		}
		
		printArray(arr);
		
	}
}
	

