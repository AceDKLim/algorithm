package 기하학;

import java.util.Scanner;

public class q2756 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = 0;
            int b = 0;
            for (int j = 0; j < 3; j++) {
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                double n = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                int s = 100;
                for (int k = 3; k < 16; k += 3) {
                    if (n <= k) {
                        a += s;
                        break;
                    } else {
                        s -= 20;
                    }
                }
            }
            for (int j = 0; j < 3; j++) {
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                double n = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                int s = 100;
                for (int k = 3; k < 16; k += 3) {
                    if (n <= k) {
                        b += s;
                        break;
                    } else {
                        s -= 20;
                    }
                }
            }
            if (a == b) {
                System.out.println("SCORE: " + a + " to " + b + ", TIE.");
            } else if (a > b) {
                System.out.println("SCORE: " + a + " to " + b + ", PLAYER 1 WINS.");
            } else if (a < b) {
                System.out.println("SCORE: " + a + " to " + b + ", PLAYER 2 WINS.");
            }
        }
        scan.close();
    }
}
