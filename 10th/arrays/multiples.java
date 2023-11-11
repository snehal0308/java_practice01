package tenth;
import java.util.*; 

// Q = print the 3rd multiples of nos which are divisible by 7 

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
		
		for(int i = 0; i <len; i++) {
			if(arr[i]%7 == 0) {
				System.out.println(arr[i]*3);
	
				
			}
			
		} 
		 
			
		}
		
		
		
	
	
}
	

