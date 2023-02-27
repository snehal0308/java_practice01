
/******************************************************************************

 program to add digits of a given number

 *******************************************************************************/
import java.util.*;
public class add_digits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int last_digit=0;

        while(num>0){
            last_digit = num%10; // choose the last digit
            sum = sum+last_digit;
            num = num/10; // eliminate the last digit
        }

        System.out.println(sum);
    }
}



