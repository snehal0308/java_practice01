/******************************************************************************

 to check if a number is a prime or not
 prime numbers only have 2 factors - 1 and itself

 *******************************************************************************/
public class prime_number
{
    public static void main(String[] args) {
        int num= 2;
        int factors = 0;

        for(int i =1; i<=num; i++){
            if(num%i==0){
                factors ++;}
        }

        if(factors == 2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime");
        }

    }
}

