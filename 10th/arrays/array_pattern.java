package tenth;
import java.util.*;

//wap to print the following pattern for 'n' no. of inputs
/* 1 3 2 4 5  // orginal array 
* 4 5 6 9
* 9 11 15
* 20 26 
* 46
* We create new arrays bys adding previous two nums 
* new array length is num-1 of the previous array 
*/

// 
public class array_pattern {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of inputs");
		int num = sc.nextInt(); 
		int org[] = new int[num]; 
		
		// storing the orginal arrays 
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the value"); 
			org[i] = sc.nextInt(); 
		}
		
		
		for(int p = num; p>0; p--) { // keeps record of arrays created 
			for(int i = 0; i<p; i++) { //printing out the new arrays 
				System.out.print(org[i]+" ");
			}
			
			// calculating next array 
			for(int i =0; i<p-1; i++) { // p-1 beacuse the length of the new ararys will always by len-1 of the previus array 
				org[i]= org[i+1] + org[i];
			}
			System.out.println(); 
			
		}
		
		
	}
	
	
	
	}
