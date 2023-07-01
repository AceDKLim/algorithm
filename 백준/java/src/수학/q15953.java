package 수학;

import java.util.Scanner;

public class q15953 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = { 500, 300, 200, 50, 30, 10 };
        int[] B = { 512, 256, 128, 64, 32 };

        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = 0;
            if (x != 0 && x <= 21) {
                int a = 1;
                for (int j = 0; j < 6; j++) {
                    if (a >= x) {
                        n += A[j];
                        break;
                    }
                    a += j + 2;
                }
            }
            if (y != 0 && y <= 31) {
                int b = 1;
                for (int j = 0; j < 5; j++) {
                    if (b >= y) {
                        n += B[j];
                        break;
                    }
                    b += Math.pow(2, j + 1);
                }
            }
            System.out.println(n * 10000);
        }
        scan.close();
    }
}
