package 구현;

import java.util.Scanner;

public class q1795 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < t; i++) {
            a += scan.nextInt();
            b += scan.nextInt();
            c += scan.nextInt();
            int m = Math.min(a, Math.min(b, c));
            if (m < 30) {
                System.out.println("NO");
            } else {
                System.out.println(m);
                a -= m;
                b -= m;
                c -= m;
            }
        }
        scan.close();
    }
}
