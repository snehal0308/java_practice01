
public class pr1 {
public static void main(String[]args) {
	
	int num1 = 6; 
	int num2 = 3; 
	int rem = 1; 
	
	int n1 = num1>num2? num2: num1; 
	int n2 = num2; 
	
	//hcf 
	
	while(num1%num2!= 0) {
		rem = n2%n1; 
		n1 = n2;
		n2 =rem; 
				}
	
	int gcd = n2; 
	
	int lcm = (num1*num2)/gcd; 
	
	System.out.println(lcm); 
	System.out.println(gcd); 
	
}
}



