package 구현;

import java.util.Scanner;

public class q27918 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 0;
        int y = 0;
        String[] score = new String[n];
        for (int i = 0; i < n; i++) {
            score[i] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            if (score[i].equals("D")) {
                x++;
            } else if (score[i].equals("P")) {
                y++;
            }
            if (x - y == 2 || x - y == -2) {
                break;
            }
        }
        System.out.println(String.format("%d:%d", x, y));
        scan.close();
    }
}
