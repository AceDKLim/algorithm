package 수학;

import java.util.Scanner;

public class q2985 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        char r1 = 0;
        char r2 = 0;
        if (a + b == c) {
            r1 = '+';
            r2 = '=';
        } else if (a - b == c) {
            r1 = '-';
            r2 = '=';
        } else if (b - a == c) {
            r1 = '=';
            r2 = '-';
        } else if (a * b == c) {
            r1 = '*';
            r2 = '=';
        } else if (a % b == 0) {
            r1 = '/';
            r2 = '=';
        } else if (b % a == 0) {
            r1 = '=';
            r2 = '/';
        }
        System.out.printf("%d%c%d%c%d", a, r1, b, r2, c);
        scan.close();
    }
}
