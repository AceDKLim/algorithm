package 수학;

import java.util.Scanner;

public class q18398 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(String.format("%d %d", a + b, a * b));
            }
        }
        scan.close();
    }
}
