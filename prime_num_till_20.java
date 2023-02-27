public class prime_num_till_20 {
    public static  void main (String args[]){
        int range = 20;
        int factors = 0;

        for(int i =1; i<=range; i++){
            factors = 0;
            for(int j =1; j<=i; j++){
                if (i%j == 0){
                    factors++;
                }
            }
            if(factors==2){
                System.out.println("prime number" + i);
            }
        }

    }
}
