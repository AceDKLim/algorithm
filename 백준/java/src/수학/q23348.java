package 수학;

import java.util.Scanner;

public class q23348 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[3];
        for (int i = 0; i < 3; i++) {
            score[i] = scan.nextInt();
        }
        int t = scan.nextInt();
        int r = 0;
        for (int i = 0; i < t; i++) {
            int c = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c += score[k] * scan.nextInt();
                }
            }
            r = Math.max(r, c);
        }
        System.out.println(r);
        scan.close();
    }
}
