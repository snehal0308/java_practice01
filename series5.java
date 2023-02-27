public class series5 {
    public static  void main(String[]args){
        int range = 5;
        double sum =0; // make sure to assign it to double type and not int

        for(int i =1; i<=range; i++){
            sum = sum + 1.0/i; // make sure to divide by 1.0 and not 1, since dividing by one will return an integer
        }

        System.out.println(sum);
    }
}
