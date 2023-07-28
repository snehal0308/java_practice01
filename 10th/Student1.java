package tenth;
// pg no 42 Q6 
import java.util.*; 

public class Student1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your marks");
		int marks = sc.nextInt(); 
		
		if(marks >90) {
			System.out.print("A++");
		}else if (marks>75 && marks<90) {
			System.out.print("A+");
		}else if(marks >60 && marks<75) {
			System.out.println("A");
		}else if(marks >50 && marks<60) {
			System.out.println("B+");
			
		}else if (marks>45 && marks<50) {System.out.println("B");}
		else {
			System.out.println("Invalid");
		}
		
		
	}

}
