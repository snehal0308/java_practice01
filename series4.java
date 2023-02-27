//1^2 + 2^2 + 3^2...
import java.lang.*;
public class series4 {
    public static void main (String[]args){
        int range = 6;
        int product =1;

        for(int i = 1; i<=range; i++){
            product = product * (i*i);
        }

        System.out.println(product);
    }
}
