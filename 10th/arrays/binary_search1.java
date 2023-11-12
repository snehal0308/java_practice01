package tenth;
import java.util.*; 


// Returns index of x if it is present in arr[l....r], else return -1

public class array1 {
	public int array1 (int arr[], int max, int min, int x) {
		
		while(min<=max) {
			int mid = (max+min)/2; 
			if(arr[mid] == x) {
				return mid;	
			}else if(arr[mid] > x) {
				max = mid - 1; 
			}else {
				min = mid +1; 
			}	
		}
		return -1; 
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		array1 ob = new array1();
		int arr[] = {1,2,3,4,5,6};
		int max = (arr.length)-1;
		System.out.println("Enter the value to found:");
		int x = sc.nextInt();
		
		
		int result = ob.array1(arr, max,0,x  );
		if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
	}
	
	
}
	

