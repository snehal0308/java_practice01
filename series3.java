
// series = 1*2*3*4...n
public class series3 {
    public static void main(String[]args){
        int range = 3;
        int product=1; // always start range from 1 - since num * 0 = 0

        for(int i =1; i<= range; i++){ // always start range from 1 - since num * 0 = 0
            product = product * i;
        }
        System.out.println(product);

    }
}
