package 수학;

import java.util.Scanner;

public class q12128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long p1 = scan.nextLong();
        long q1 = scan.nextLong();
        long p2 = scan.nextLong();
        long q2 = scan.nextLong();
        scan.close();

        long p = p1 * p2;
        long q = q1 * q2 * 2;

        if (p % q == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
