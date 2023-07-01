package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q18411 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[3];
        for (int i = 0; i < 3; i++) {
            score[i] = scan.nextInt();
        }
        Arrays.sort(score);
        System.out.println(score[1] + score[2]);
        scan.close();
    }
}
