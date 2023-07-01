package 수학;

import java.util.Scanner;

public class q10707 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        scan.close();
        int x = a * p;
        int y = c >= p ? b : b + (p - c) * d;
        System.out.println(Math.min(x, y));
    }
}
