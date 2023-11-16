package tenth;
import java.util.*;

// wap  to get  the char at index 1 and 10 witiin the string 
// Q7 Pg 223
public class substring1 {
	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in); 
			 
			System.out.println("Enter a string"); 
			String str = sc.nextLine();
			
			String str2 = str.substring(1, 11);
			
			char ch1 = str2.charAt(0); 
			char ch2 = str2.charAt(9); 
			
			System.out.println(ch1);
			System.out.println(ch2);
			
		}
	
	
	
	}
