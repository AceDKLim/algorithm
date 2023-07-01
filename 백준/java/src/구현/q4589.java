package 구현;

import java.util.Scanner;

public class q4589 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Gnomes:");
        for (int i = 0; i < n; i++) {
            int[] t = new int[3];
            for (int j = 0; j < 3; j++) {
                t[j] = scan.nextInt();
            }
            if ((t[0] < t[1] && t[1] < t[2]) || (t[0] > t[1] && t[1] > t[2])) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }
        scan.close();
    }
}
