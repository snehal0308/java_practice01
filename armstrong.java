/******************************************************************************

 check if a digit is an armstrong digit or not

 *******************************************************************************/
import java.lang.*;
public class armstrong
{
    public static void main(String[] args) {
        int num = 153;
        int last_digit = 0;
        int sum = 0;
        int i = num;

        while( i>0){
            last_digit = i%10; // store the last_digit
            sum = sum + last_digit*last_digit*last_digit; // store the cube of last digit
            i = i/10;  // delete the last digit
        }

        if(sum == num)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");

        System.out.println(sum);
    }
}

