package tenth;
import java.util.*; 
// pg 95 Q12 

public class Student {
	int roll_no; 
	String name ; 
	int marks1; 
	int marks2;
	double avg = (marks1+marks2)/2; 
	

	
	void set(Student obj2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		 obj2.name = sc.nextLine(); 
		System.out.println("Enter roll no");
		 obj2.roll_no = sc.nextInt(); 
		 System.out.println("Enter marks1");
		 obj2.marks1 = sc.nextInt();
		 System.out.println("Enter marks2");
		 obj2.marks2 = sc.nextInt(); 
		 
	}
	double getavg(Student obj2) {
		obj2.avg = (obj2.marks1+obj2.marks2)/2;
		return (obj2.avg);
	}
	
	void display(Student obj2) {
		System.out.println("Your roll no is: "+obj2.roll_no);
		System.out.println("your name is"+ obj2.name);
		System.out.println("your marks1 are: "+obj2.marks1);
		System.out.println("your marks2 are"+obj2.marks2);
		System.out.println("avg is: "+ obj2.avg);
		
	}
	
	public static void main(String[]args) {
		Student obj = new Student(); 
		obj.set(obj);
		obj.getavg(obj);
		obj.display(obj);
		
		
		
	}
	
}

