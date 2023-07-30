package tenth;
/*
 * A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,then the number is a magic number. 

For example- 
Number= 50113 
=> 5+0+1+1+3=10 
=> 1+0=1 
This is a Magic Number 
 */

public class Magic {
public static void main(String[]args) {
	int n = 50113; 
	int sum = 0; 
	
	while(n>9) { // check if more than 1 and run the loop 
		sum = 0; // imp step - to restart the loop in case sum>9
		while(n>0) {
		int last_digit = n%10; // stores the last digit
		 sum+= last_digit; // add to sum 
		 n = n/10; // eliminate the last digit
	}
		n = sum ; 
	}
	if(n ==1) {
		System.out.println("Magic no");
	}else {
		System.out.println("not a magic no"); 
	}
	
}
}
