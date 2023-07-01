package 수학;

import java.util.Scanner;

public class q20233 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int x = scan.nextInt();
        int b = scan.nextInt();
        int y = scan.nextInt();
        int t = scan.nextInt();
        scan.close();
        int one = Math.max((t - 30), 0) * x * 21 + a;
        int two = Math.max((t - 45), 0) * y * 21 + b;
        System.out.println(one + " " + two);
    }
}
