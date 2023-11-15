package tenth;
import java.util.*;

//wap to sort the names and telephones no. of 'n' ppl and sort them in ascending order 
// PG 189 note b)

// 
public class bubble_sort3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of people");
		int num = sc.nextInt(); 
		
		String names[] = new String[num]; 
		int  nums[] = new int[num]; 
		
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the name and their phone no."); 
			names[i] = sc.next(); 
			nums[i] =sc.nextInt(); 
		}
		
		// sorting = bubble sort 
		for(int i = 0; i<num-1; i++) {
			for(int j = 0; j<num-i-1; i++) {
				if(nums[j]>nums[j+1]) {
					// swao 
				int temp = nums[j]; 
				nums[j] = nums[j+1]; 
				nums[j] = temp; 
				}
			}
		}
		
		
		for(int i =0; i<num; i++) {
			System.out.println( names[i]+ " " +nums[i]);
		}
		
		}
	
	
	
	}
