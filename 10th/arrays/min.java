package tenth;
import java.util.*; 

// Q = print the largest num from an array 

public class array1 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of values to be entered: ");
		int len = sc.nextInt();  
		
		int arr[] = new int[len];
		for(int i = 0; i<len; i++) {
			System.out.println("Enter the value: "); 
			int num = sc.nextInt();
			arr[i] = num; 
		}
		int min = arr[0];
		
		for(int i = 0;  i <len; i++) {
			if(arr[i] < arr[0])
				min = arr[i]; 
			
			
		} 
		System.out.println(min);
		 
			
		}
		
		
		
	
	
}
	

