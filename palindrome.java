/******************************************************************************

 to check if string if palindrome or not

 *******************************************************************************/
import java.util.*;
public class palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String rev = "";
        int len = str.length();

        for(int i=len-1; i>=0; i--)
            rev = rev + str.charAt(i);

        if(str.equals(rev))
            System.out.println("palindrome");
        else
            System.out.println("Not a palindrome");
    }
}


