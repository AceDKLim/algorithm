package 수학;

import java.util.Scanner;

public class q18247 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a < 12 || b < 4) {
                System.out.println(-1);
            } else {
                System.out.println(11 * b + 4);
            }
        }
        scan.close();
    }
}
