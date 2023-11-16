package tenth;
import java.util.*;

// wap  to accpet a character. If it is a letter then display the cae, otherwise check whether it is a digit or a special character 
// Q7 Pg 223
public class chars1 {
	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in); 
			 
			System.out.println("Enter a character"); 
			char ch = sc.next().charAt(0);
			
			if(ch >= 'a' && ch <='z')
				System.out.println("character isin lowercase: " + ch );
			else if(ch >='A' && ch <='Z' )
				System.out.println("Character is in uppercase: " + ch);
			else if (Character.isDigit(ch))
				System.out.println("Character is a digit"); 
			else 
				System.out.println("Character is a special character");
		}
	
	
	
	}
