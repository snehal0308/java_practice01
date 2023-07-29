package tenth;
import java.lang.*;
// pg no 119, Q
public class Interest {
	double A = 27983; // amt rithvik got
	double p = 20000; // amt he invested 
	double r ; // need to find out rate
	double t = 1;
	double n = 3/2;
	// 18 months = 2/3
	Interest(){
// r  = (100 * P) – (Math.pow (A, 2/3) * 100)   / P
//r = (100*p)-(Math.pow(A,n)*100)/p;
		// R = n[(A/P)^(1/nt)-1] × 100 // formula for finding interest 
		r = n*(Math.pow(A/p,(1/n))-1)*100; 
	}
	void display() {
		System.out.println("The rate of interest is: "+ r);
	}
	
	public static void main(String[]args) {
		Interest obj = new Interest();
		obj.display();
		
	}
}
