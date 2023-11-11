package tenth;
import java.util.*; 

// Q = print the sum of all even elements in an array 

public class array1 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of values to be entered: ");
		int len = sc.nextInt(); 
		int sum = 0; 
		
		int arr[] = new int[len];
		for(int i = 0; i<len; i++) {
			System.out.println("Enter the value: "); 
			int num = sc.nextInt();
			arr[i] = num; 
		}
		
		for(int i = 0; i <len; i++) {
			if (arr[i]%2 == 0 )
			sum = sum + arr[i]; 
		} 
		
		System.out.println(sum); 
			
		}
		
		
		
	
	
}
	

