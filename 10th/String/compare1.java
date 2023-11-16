package tenth;
import java.util.*;

// wap  to compare 2 strings lexiocographically
// Q7 Pg 223
public class compare1 {
	public static void main(String[]args) {
			String org = "Helllo people";
			String ends ="hellooo people";
			
			int b = org.compareToIgnoreCase(ends);
			 System.out.println(b);
			 
			 // output will be -3 because l = 108, o = 111 => 108-111 = 3
		}
	
	
	
	}
