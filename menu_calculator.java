/******************************************************************************

 write a menu based program choose from addition, subtraction, multiplication and division of two numbers input by the user

 *******************************************************************************/
import java.util.*;
public class menu_calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter an operator");
        char opt = sc.next().charAt(0);

        switch(opt){
            case'+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case'*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            default:
                System.out.println("Not a valid character");
                return;

        }
    }
}

