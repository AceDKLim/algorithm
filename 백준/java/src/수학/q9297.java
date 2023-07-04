package 수학;

import java.util.Scanner;

public class q9297 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = x / y;
            int b = x % y;
            System.out.printf("Case %d:", i);
            if (a != 0) {
                System.out.print(" " + a);
            }
            if (b != 0) {
                System.out.printf(" %d/%d", b, y);
            }
            if (a == 0 && b == 0) {
                System.out.print(" 0");
            }
            System.out.println();
        }
        scan.close();
    }
}
