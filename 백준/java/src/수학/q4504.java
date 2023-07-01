package 수학;

import java.util.Scanner;

public class q4504 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (true) {
            int p = scan.nextInt();
            if (p == 0) {
                break;
            } else if (p % n == 0) {
                System.out.printf("%d is a multiple of %d.\n", p, n);
            } else {
                System.out.printf("%d is NOT a multiple of %d.\n", p, n);
            }
        }
        scan.close();
    }
}
