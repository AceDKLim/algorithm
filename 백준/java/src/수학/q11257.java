package 수학;

import java.util.Scanner;

public class q11257 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float[] t = { 35 * 0.3f, 25 * 0.3f, 40 * 0.3f };

        for (int i = 0; i < n; i++) {
            String result = "PASS";
            int[] score = new int[4];
            for (int j = 0; j < 4; j++) {
                score[j] = scan.nextInt();
            }
            int s = 0;
            for (int j = 0; j < 3; j++) {
                if (t[j] > score[j + 1]) {
                    result = "FAIL";
                }
                s += score[j + 1];
            }
            if (s < 55) {
                result = "FAIL";
            }

            System.out.println(String.format("%d %d %s", score[0], s, result));
        }

        scan.close();
    }
}
