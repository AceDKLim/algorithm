package 기하학;

import java.util.Scanner;

public class q9649 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int ab = scan.nextInt();
            int ac = scan.nextInt();
            int bd = scan.nextInt();
            int x = ab * ac;
            int y = bd - ac;
            int t = gcd(x, y);
            System.out.println(String.format("%d/%d", x / t, y / t));
        }
        scan.close();
    }

    static int gcd(int a, int b) {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
