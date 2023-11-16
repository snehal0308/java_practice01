package tenth;
import java.util.*;

// wap to input a string and convert it into uppercase and print the vowels and freq of occurrence of each 
// vowels in the string 
// Q6 Pg 223
public class vowels {
	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in); 
			String str = sc.nextLine().toUpperCase(); 
			int len = str.length(); 
			// snehal is great 
			int e = 0; 
			int a = 0; 
			int i = 0; 
			int o = 0; 
			int u = 0; 
			
			for(int i1 = 0; i1<len; i1++) {
				switch(str.charAt(i1)) {
				case 'A':
					a++ ;
				case 'E':
					e++ ;
				case 'I':
					i++ ;
				case 'O':
					o++ ;
				case 'U': 
					u++ ;
			
				}
			
		}
			System.out.println("A is repeating " + a);
			System.out.println("E is repeating " + e);
			System.out.println("O is repeating " + o);
			System.out.println("U is repeating " + u);
			System.out.println("I is repeating " + i);
	
	
	}
	}
