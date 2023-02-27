/******************************************************************************

 factorial of a number

 *******************************************************************************/
import java.util.*;
public class factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double product = 1.0;

        for(double i = num; i>0; i--)
            product *= i;
        System.out.println(product);


    }
}

