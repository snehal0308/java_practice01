package tenth;
import java.util.*;

//wap to sort the names of 'n' ppl based on their marks 
// PG 189 note a)

// 
public class bubble_sort2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of students");
		int num = sc.nextInt(); 
		
		String names[] = new String[num]; 
		int  marks[] = new int[num]; 
		
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the name and their marks"); 
			names[i] = sc.next(); 
			marks[i] =sc.nextInt(); 
		}
		
		// sorting using bubble sort 
		for(int i = 0; i<num-1; i++) {
			for(int j = 0;j <num-i-1; j ++) {
				if(marks[j] > marks[j+1]) {
					// swap  
					int temp = marks[j];
					String temp_name = names[j];
					
					marks[j] = marks[j+1]; 
					names[j] = names[j+1]; 
					
					marks[j+1] = temp; 	
					names[j+1] = temp_name;
				}
			}
		}
		
		for(int i =0; i<num; i++) {
			System.out.println( names[i]+ " " +marks[i]);
		}
		
		}
	
	
	
	}
