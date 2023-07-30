package tenth;
// duck number - a 3 digit number which has 1 or more than 1 0s
public class Duck {
	public static void main(String[]args) {
		int n = 193; 
		int c = 0; // counts number of zeroes
		
		if(n>999) { // check if its more than 3 digit 
			System.out.println("Not a 3 digit number"); // check if its 3 digit
			
		}else if (n>99 && n<1000) { // check if its 3 digit 
			while (n>0) {
				int last_digit = n%10; // stores the last digit
				if(last_digit == 0) { // check if last digit == 0 
					c++; // if true then add in c
				}
				n = n/10; // eliminate the last digit
			}
		}
		
		if(c >=1) {
			System.out.println("Its a duck no."); 
		}else {
			System.out.println("Its not a duck no.");
		}
	}

}
