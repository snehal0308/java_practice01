package tenth;
import java.util.*;

// perfect num 
// which sum of factors is equal the num excluding the num itself 

public class perfect {
	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number"); 
			int num = sc.nextInt(); 
			
			int sum = 0; // to store sum of factoss
			
			for(int i =1; i<num; i++) {
				if(num%i ==0) {
					sum+= i;
				}
			}
			if(sum == num)
				System.out.println("Perfect number"); 
			else
				System.out.println("Not a perfect number");
			
			System.out.println("sum is " + sum); 
			
		}
	
	
	
	}
