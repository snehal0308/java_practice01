package tenth;
import java.util.*;

// wap  to accept a sample striing and replace the word blue with red 
// Q1 Pg 223
public class replace1 {
	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word"); 
			String sample = sc.next().toLowerCase();
			
			sample = sample.replace("blue", "red");
			System.out.println(sample);
		}
	
	
	
	}
