package tenth;
import java.util.*;

//wap to input the name and gender code(B/G) for 'n' no of students and store them in two different arrays. Print the separate list for boys and girls  
public class student2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter total no. of students"); 
		int num = sc.nextInt(); 
		// creating separate arrays for boys and girls 
		 String[] boys = new String[num];
	     String[] girls = new String[num];
		
		// creating arrat of names and genders
		
		String names [] = new String[num]; 
		char gens[] = new char[num]; 
		
		// asking the user for name and gender and storing in array
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the student's name and gender"); 
			names[i] = sc.next(); 
			gens[i] = sc.next().charAt(0);
			gens[i] = Character.toUpperCase(gens[i]); 
 			
			
			if (gens[i] == 'B') {
                boys[i] = names[i];
            } else if (gens[i] == 'G') {
                girls[i] = names[i];
            } else {
                System.out.println("Invalid gender code. Please enter 'B' or 'G'.");
                i--; // Decrement i to repeat the input for the current student
            }
		}
		
		// print out the arrays
		int len_g = girls.length; 
		int len_b = boys.length; 
		
		for(int i = 0; i<len_g; i++) {
			if(girls[i]!= null)// only print out if it has a name stored 
			System.out.println(girls[i]);
		}
		
		for(int i = 0; i<len_g; i++) {
			if(boys[i]!= null)// only print out if it has a name stored 
			System.out.println(boys[i]);
		}
		
		
		
	}
	}
