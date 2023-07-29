package tenth;
// pg no 117 Q8
import java.util.*;
public class Ticket{
		double price1, total1, balance1; 
		
	Ticket(){ // constructor if user does not pass anything - 8d)
		price1 = 0; 
		total1= 0; 
		balance1= 0; 
	}

	Ticket(double price, double total, double balance){ // if the user passes all the fields -8A)
		price1 = price; 
		total1 = total; 
		balance1= balance;
	}
	
	Ticket(double price){// if the user passes only price - 8b)
		price1 = price; 
		total1= 0; 
		balance1= 0; 
	}
	
	Ticket(double price, double total){ // if the user passes only price & total - 8c)
		price1 = price; 
		total1= total; 
		balance1= 0; 
	}
	
	
	void display() {
		System.out.println("Your balance is: "+ balance1);
		System.out.println("Your total is:"+ total1);
		System.out.println("Your price is: "+ price1);
	}
	
	public static void main(String[]args) {
		Ticket obj = new Ticket(1200);
		obj.display();
	}

}
