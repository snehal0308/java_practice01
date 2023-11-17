package tenth;
import java.util.*;

// piglatin word 

 public class piglatin {
	 public static void main(String[]args)
	 {
		String str = "Bottle".toLowerCase();// ottlebay = ay is constant  
		String nstr = ""; 
		int len =str.length(); 
		
		for(int i = 0; i<len; i++) {
			char ch = str.charAt(i); 
			if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				 nstr = str.substring(i) + str.substring(0,i) + "ay";
				 break; 
			}
		}
		System.out.println(nstr);
		
		
	}
 }
