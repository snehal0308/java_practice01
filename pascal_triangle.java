public class pascal_triangle {
    public static void main(String[]args){
        int range = 5;

        // outer for loop
        for(int i = 1; i<=range; i++){
            // inner for loop for space

            for(int k =range; k>range; k--  ){
                System.out.println(" ");
            }

            // inner for loop for number
            int num = 1; nj
            for(int j =0; j<=i; j++){
                System.out.print(num+ " ");
                num = num * (i-j)/(j+1); // imp formula for pascal's triangle
            }

            System.out.println();

        }
    }
}
