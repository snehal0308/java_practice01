/* 1
* 123
* 1234
* 12345*/

public class pattern1_floyd_triangel {
    public static void main(String[]args){
    int range = 5;

    for(int i = 1; i<=range; i++){
        for(int j = 1; j<i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}}