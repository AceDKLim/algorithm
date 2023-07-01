package 수학;

import java.util.Scanner;

public class q21312 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(a * b * c);
        } else {
            int r = 1;
            if (a % 2 == 1) {
                r *= a;
            }
            if (b % 2 == 1) {
                r *= b;
            }
            if (c % 2 == 1) {
                r *= c;
            }
            System.out.println(r);
        }
    }
}
