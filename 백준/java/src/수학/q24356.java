package 수학;

import java.util.Scanner;

public class q24356 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t1 = scan.nextInt();
        int m1 = scan.nextInt();
        int t2 = scan.nextInt();
        int m2 = scan.nextInt();
        scan.close();
        int t = 0;
        t = 24 - t1 + t2;
        t *= 60;
        t += m2 - m1;
        t = t >= 24 * 60 ? t - 24 * 60 : t;

        System.out.println(t + " " + t / 30);
    }
}
