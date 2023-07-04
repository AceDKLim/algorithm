package 수학;

import java.util.Scanner;

public class q9924 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int x = a;
        int y = b;
        int n = 0;
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        while (a != b) {
            a -= b;
            int t = a;
            a = b;
            b = t;
            n++;
        }
        System.out.println(n);
        int r = 0;
        while (y != 0) {
            int q = x / y;
            x %= y;
            int t = x;
            x = y;
            y = t;
            r += q;
        }

        System.out.println(r);
    }
}
