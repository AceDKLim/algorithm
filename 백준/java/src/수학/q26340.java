package 수학;

import java.util.Scanner;

public class q26340 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(String.format("Data set: %d %d %d", a, b, c));
            for (int j = 0; j < c; j++) {
                if (a > b) {
                    a /= 2;
                } else {
                    b /= 2;
                }
            }
            if (a < b) {
                int t = a;
                a = b;
                b = t;
            }
            System.out.println(a + " " + b);
            System.out.println();
        }
        scan.close();
    }
}
