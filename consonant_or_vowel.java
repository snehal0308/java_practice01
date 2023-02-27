/******************************************************************************

 program to find if 3 numbers form a pythogorean triplet



 *******************************************************************************/
import java.util.*;
import java.lang.*;
public class consonant_or_vowel {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            char letter = sc.next().charAt(0);

            switch(letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    System.out.println("This a vowel");
                    break;

                default:
                    System.out.println("This is a consonant");
                    return;
            }
        }
    }


