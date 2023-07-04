package 수학;

import java.util.Scanner;

public class q15340 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] call = { 30, 35, 40 };
        int[] data = { 40, 30, 20 };
        while (true) {
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (c == 0 && d == 0) {
                break;
            }
            int r = 100000;
            for (int i = 0; i < 3; i++) {
                int n = c * call[i] + d * data[i];
                r = Math.min(n, r);
            }
            System.out.println(r);
        }
        scan.close();
    }
}
