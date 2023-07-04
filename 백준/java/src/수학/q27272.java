package 수학;

import java.util.Scanner;

public class q27272 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] r = new int[4];
        for (int i = 0; i < 4; i++) {
            r[i] = scan.nextInt();
        }
        scan.close();
        int m = r[0] * r[1] + r[2] * r[3];
        int t = r[0] * r[1] * r[2] * r[3];
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int q = r[i] * r[j];
                m = Math.max(q + t / q, m);
            }
        }
        System.out.println(m);
    }
}
