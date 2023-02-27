// inverted triable == 55555
//                     4444
//                     333
//                     22
//                     1
public class inverted_triangle {
    public static void main(String[]args){
        int range = 5;

        for(int i = range; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


}
