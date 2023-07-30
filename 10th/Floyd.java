package tenth;

public class Floyd {
	public static void main(String[]args) {
		int range = 5;
		int k = 1; 
		
		for (int i = 1; i<=range; i++) {
			for(int j = 1; j<=i; j++, k++) {
				System.out.print(k+"");
			}
			System.out.println();
		}
	}
}
