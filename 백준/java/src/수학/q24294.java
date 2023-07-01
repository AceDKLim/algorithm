package 수학;

import java.util.Scanner;

public class q24294 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w1 = scan.nextInt();
        int h1 = scan.nextInt();
        int w2 = scan.nextInt();
        int h2 = scan.nextInt();
        scan.close();
        int a = w1;
        int b = h1 + h2;
        int c = w2;
        int d = h2;
        int e = Math.abs(w1 - w2);
        int f = h1;
        System.out.println(4 + a + b + c + d + e + f);
    }
}
