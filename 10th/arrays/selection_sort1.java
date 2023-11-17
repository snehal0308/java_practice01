package tenth;
import java.util.*; 


// basic selection sort 

public class selection_sort1 {
	
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
		
		for(int i = 0; i<=len-1; i++){
			int smallest = i;
			for(int j = i+1; j<len; j++) {
				if(arr[smallest] > arr[j]) {
					
					smallest = j ; 
				}
			}
			// time for a nice swap :)
			int temp = arr[smallest]; 
			arr[smallest] = arr[i]; 
			arr[i] = temp; 
		}
		
		printArray(arr);
		
	}
}
	
