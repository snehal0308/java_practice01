/******************************************************************************

 fibonaaci series

 *******************************************************************************/
import java.util.*;
public class fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int i = 0;
        int a = 0;
        int b = 1;
        int c;


        while(i<=range){
            i++;
            c= a + b;
            System.out.println(c);
            a =b ;
            b = c;
        }
    }
}

