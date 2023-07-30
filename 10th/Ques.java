package tenth;

// Question 8 from specimen paper
// to print the square root of each of the given number 
public class Ques {
	static void display(int n) {
		int num = n;
		while (num > 0) {
			int last_digit = num%10; 
			System.out.println(Math.sqrt(last_digit));
			num = num/10; 
		}
		
		
	}
	
	public static void main(String[]args) {
		
		display(4329);
	}

}
