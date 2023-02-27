/******************************************************************************

 write a program to find the largest of 4 numbers


 *******************************************************************************/
import java.util.*;
import java.lang.*;
public class largest_num_4
{
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 6;
        int n3 = 8;

        int large1 = Math.max(n1, n2);
        int large2 = Math.max(large1, n3);

        System.out.println(large2);
    }
}

