/******************************************************************************
 Write a program to check even or add number
 *******************************************************************************/
import java.util.*;

class even_or_odd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("This is an even number                      ");
        }else{
            System.out.println("This is a odd number");
        }
    }
}
