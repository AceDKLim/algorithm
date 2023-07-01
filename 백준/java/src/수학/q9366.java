package 수학;

import java.util.Scanner;

public class q9366 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int m = Math.max(a, Math.max(b, c));
            if (a + b + c - m <= m) {
                System.out.printf("Case #%d: invalid!\n", i);
            } else if (a == b && b == c) {
                System.out.printf("Case #%d: equilateral\n", i);
            } else if (a != b && b != c) {
                System.out.printf("Case #%d: scalene\n", i);
            } else {
                System.out.printf("Case #%d: isosceles\n", i);
            }
        }
        scan.close();
    }
}
