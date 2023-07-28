package tenth;
import java.util.*; 
// pg 64 Q5

public class Emplloyee {
	static String name; 
	static Float salary; 
	
	
	Emplloyee(String name1, Float sal){
		name = name1; 
		salary = sal; 
	}
	
	Float salary() {
		Float total_salary = 0.5f *salary;
		return total_salary; 
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine(); 
		Float sal = sc.nextFloat(); 
		
		Emplloyee emp1 = new Emplloyee(name, sal); 
		System.out.println(emp1.salary());
		
	}

}
