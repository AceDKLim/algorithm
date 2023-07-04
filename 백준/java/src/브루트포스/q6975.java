package 브루트포스;

import java.util.Scanner;

public class q6975 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int r = 0;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    r += j;
                }
            }
            if (n == r) {
                System.out.println(n + " is a perfect number.");
            } else if (n < r) {
                System.out.println(n + " is an abundant number.");
            } else {
                System.out.println(n + " is a deficient number.");
            }
            System.out.println();
        }
        scan.close();
    }
}
