package tenth;// pg no 94 Q11

public class Demo {
	int marks; 
	
	Demo(int marks1){	// imp to initialize constructor in order to accept marks 
		 marks = marks1;
		}; 
		
	void compare(Demo obj2) {
		if (marks > obj2.marks) {
            System.out.println("The larger marks are from the current object: " + marks);
        } else if (marks < obj2.marks) {
            System.out.println("The larger marks are from the other object: " + obj2.marks);
        } else {
            System.out.println("Both objects have the same marks: " + marks);
        }
			
	}
	
	int avg(Demo obj2) {
		marks = marks;
		int avg_marks = (marks+ obj2.marks)/2; 
		return avg_marks; 
	}
	
	public static void main(String[]args) {
		Demo obj1 = new Demo(10); 
		Demo obj2 = new Demo(15);
		
		obj1.compare(obj2);
		System.out.println("Average is: "+obj1.avg(obj2));
		
	}

}
