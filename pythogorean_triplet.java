/******************************************************************************

 program to find if 3 numbers form a pythogorean triplet


 *******************************************************************************/
import java.util.*;
import java.lang.*;
public class pythogorean_triplet
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 =  sc.nextDouble();

        double square = Math.pow(n1,2) + Math.pow(n2,2);

        if(square == Math.pow(n3,2)){
            System.out.println("Pythogorean triplet");
        }
    }
}

