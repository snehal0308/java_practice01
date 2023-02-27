/******************************************************************************
 reverse a given number
 *******************************************************************************/
public class reverse_num
{
    public static void main(String[] args) {
        int num = 543;
        int last_digit = 0;
        int rev = 0;

        while(num>0){
            last_digit = num%10; // store the last digit
            rev = rev*10+last_digit; // spare for the last digit
            num = num/10; // eliminate the last digit
        }

        System.out.println(rev);
    }
}

