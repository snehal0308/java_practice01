/******************************************************************************

 Write a program to execute the following equation for an 1 + (1 + 2) +(1+2+3)....(1+2+3..+n)

 *******************************************************************************/
public class series1
{
    public static void main(String[] args) {
        int range = 5;
        int sum = 0;

        for(int i =1; i<=range; i++){ //1 2 3
            for(int k =1; k<=i; k++){ // 1 2 3
                sum= sum+k; // 0+1 + 2 + 3
            }
        }

        System.out.println(sum);
    }
}

