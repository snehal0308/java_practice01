package tenth;
import java.util.*; 


//	write a program to accept marks of 20 students and display the name of the student who has got the max marks 

public class max_marks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the no. of students"); 
		int num = sc.nextInt(); 
		int marks[] = new int[num]; 
		int max  = marks[0];
		
		// storing marks 
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the marks of"+ (i+1)+"Student:"); 
			marks[i] = sc.nextInt(); 	
		}
		
		// finding the highest mark
		
		for(int i = 0; i<num; i++) {
			if(marks[i]>max) {
				max = marks[i]; 
			}
		}
		System.out.println(max); 
	}
}
	
