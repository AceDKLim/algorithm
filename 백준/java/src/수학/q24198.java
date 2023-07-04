package 수학;

import java.util.Scanner;

public class q24198 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int a = 0;
        int b = 0;
        boolean c = true;
        while (n > 1) {
            int t = n / 2;
            n -= t;
            if (c == true) {
                a += t;
                c = false;
            } else {
                b += t;
                c = true;
            }
        }
        if (c == true) {
            a += n;
        } else {
            b += n;
        }
        System.out.printf("%d %d", b, a);
    }
}
