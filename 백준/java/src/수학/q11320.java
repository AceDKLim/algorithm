package 수학;

import java.util.Scanner;

public class q11320 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            a /= scan.nextInt();
            int r = 0;
            for (int j = 1; j <= a; j++) {
                r += (2 * j) - 1;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
