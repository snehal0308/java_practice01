package tenth;
import java.util.*;

//wap to sort the names of 'n' ppl based on their marks 
//PG 189 note a)
// uisng selection sort 

// 
public class selection_sort3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of people");
		int num = sc.nextInt(); 
		
		String names[] = new String[num]; 
		int  marks[] = new int[num]; 
		
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the name and their marks"); 
			names[i] = sc.next(); 
			marks[i] =sc.nextInt(); 
		}
		
		
		// selection sort 
		for(int i =0; i<num-1; i++) {
			int smallest = i; 
			for(int j = i+1; j<num; j++) 
			{
				
				if(marks[smallest] > marks[j])
					smallest = j;
			
			
			// swap 
				// remember to swap the names aswell 
			int temp = marks[smallest];
			String temp_name = names[smallest];
			marks[smallest] = marks[j]; 
			names[smallest] = names[j];
			marks[j] = temp; 
			names[j]= temp_name;
			
			}
			
		}
		
		for(int i =0; i<num; i++) {
			System.out.println( names[i]+ " " +marks[i]);
		}
		
		}
	
	
	
	}
