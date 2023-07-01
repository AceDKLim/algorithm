package 수학;

import java.util.Scanner;

public class q5692 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int k = 0;
            int r = 0;
            if (n == 0) {
                break;
            }

            for (int i = 1; i < 7; i++) {
                if (n % (int) Math.pow(10, i) >= n) {
                    k = i - 1;
                    break;
                }
            }
            for (int i = k; i >= 0; i--) {
                int t = n / (int) Math.pow(10, i);
                // System.out.println(t);
                int p = 1;
                for (int j = 1; j <= (i + 1); j++) {
                    p *= j;
                }
                r += p * t;
                n %= (int) Math.pow(10, i);
            }
            System.out.println(r);
        }
        scan.close();
    }
}
