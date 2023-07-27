package tenth;
// pg 94 Q7

import java.util.*;
class Temperature{
	double convert(double temp)
{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter temp in celsius");
		//double temp_cel = sc.nextDouble();
		temp = 1.8*temp+32.0; 
		return(temp);
}
		
}
public class Display {
	public static void main(String[]args) {
	Temperature obj = new Temperature(); 
	System.out.println(obj.convert(1.5));

}}
