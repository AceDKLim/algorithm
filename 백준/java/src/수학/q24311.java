package 수학;

import java.util.Scanner;

public class q24311 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t1 = scan.nextInt();
        int t2 = scan.nextInt() - 10;
        t2 -= scan.nextInt();
        t1 -= scan.nextInt();
        t2 -= scan.nextInt();
        int br = scan.nextInt() + 1;
        t2 -= (br * scan.nextInt());
        scan.close();
        while (t2 < 0) {
            t2 += 60;
            t1 -= 1;
        }
        while (t1 < 0) {
            t1 += 24;
        }
        System.out.printf("%02d %02d\n", t1, t2);
    }
}
