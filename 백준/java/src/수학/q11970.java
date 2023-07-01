package 수학;

import java.util.Scanner;

public class q11970 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        if (a < c) {
            int t = a;
            a = c;
            c = t;
            int p = b;
            b = d;
            d = p;
        }
        int g = 0;
        if (a < d) {
            if (b <= d) {
                g = b - a;
            } else {
                g = d - a;
            }
        }
        System.out.println(b - a + d - c - g);
    }
}
