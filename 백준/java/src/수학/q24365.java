package 수학;

import java.util.Scanner;

public class q24365 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int n = (a + b + c) / 3;
        int r = 0;
        int t = c - n;
        c -= t;
        b += t;
        r += t;

        t = b - n;
        b -= t;
        a += t;
        r += t;

        System.out.println(r);
    }
}
