package tenth;
import java.util.*;

//wap to find the city with max temp
// PG 186 Q2

// 
public class max_mintemp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of cities");
		int num = sc.nextInt();
		
		int temp[] = new int[num]; 
		String cities[] = new String[num]; 
		
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the name and temp of the city: "); 
			cities[i] = sc.next(); 
			temp[i] = sc.nextInt(); 
		}
		
		int max = 0;
		for(int i = 1; i<num; i++) {
			if (temp[max]<temp[i])
				max = i; 
		}
		System.out.println("City with max temp is "+cities[max] + " with a temp of " + temp[max]);
	
		
		
	}
	
	
	
	}
