package tenth;
import java.util.*;

// pg 197 Q 5 

public class mark_finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of inputs");
        int num = sc.nextInt();
        int roll[] = new int[num];
        int percent[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the roll no. and percentage");
            roll[i] = sc.nextInt();
            percent[i] = sc.nextInt();
        }

        // using binary search
        System.out.println("Enter the roll no ");
        int roll_1 = sc.nextInt();
        int highest = num - 1;
        int lowest = 0;
        boolean found = false;

        while (lowest <= highest) {
            int mid = (highest + lowest) / 2;
            if (roll[mid] == roll_1) {
                System.out.println("The marks are: " + percent[mid]);
                found = true;
                break;
            } else if (roll_1 < roll[mid]) {
                highest = mid - 1;
            } else {
                lowest = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Roll no. not found");
        }




        sc.close();
    }
}
