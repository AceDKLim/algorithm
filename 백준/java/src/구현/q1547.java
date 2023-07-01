package 구현;

import java.util.Scanner;

public class q1547 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ball = 1;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == ball) {
                ball = b;
            } else if (b == ball) {
                ball = a;
            }
        }
        scan.close();
        System.out.println(ball);
    }
}
