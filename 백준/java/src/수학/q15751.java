package 수학;

import java.util.Scanner;

public class q15751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(Math.min(Math.abs(y - x), Math.abs(x - a) + Math.abs(y - b)));
    }
}
