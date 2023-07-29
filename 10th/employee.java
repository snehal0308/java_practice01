package tenth;
// pg no 117 Q5
import java.util.*;
public class employee {
		String name ; 
		int code;
		double basic, hra, da, pf;
		
		employee(){
			code = 0; 
			name = "";
			basic = 0; 
			hra = 0; 
			da =0; 
			pf = 0;
		}

		
		employee(int id, String str, double sal ){
			code = id; 
			name  = str; 
			basic = sal; 
			hra = 0.1*basic; 
			da = (55/100)*basic; 
			pf = 1000; 
		}
}
