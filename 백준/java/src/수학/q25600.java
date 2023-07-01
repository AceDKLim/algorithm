package 수학;

import java.util.Scanner;

public class q25600 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int d = scan.nextInt();
            int g = scan.nextInt();
            int s = a * (d + g);
            if (a == d + g) {
                s *= 2;
            }
            r = Math.max(r, s);
        }
        scan.close();
        System.out.println(r);
    }
}
