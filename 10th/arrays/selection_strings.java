package tenth;
import java.util.*;

// selection sort array of strings 

 public class selection_strings {
	 public static void main(String[]args)
	 {
		 String str[] = {"b", "a", "c", "d"}; 
		 int len = str.length; 
		 
		 for(int i = 0; i<len-1; i++) {
			 for(int j = i+1; j<len; j++) {
			 if(str[i].compareTo(str[j]) > 0) {
				 String temp = str[j]; 
				 str[j] = str[i]; 
				 str[i] = temp; 
				 
			 }
			 }
		 }
		 
		 for(int i = 0; i<len; i++) {
			 System.out.println(str[i]);
		 }
		 
		
	}
 }
