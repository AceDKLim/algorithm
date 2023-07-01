package 수학;

import java.util.Scanner;

public class q2991 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        for (int i = 0; i < 3; i++) {
            int n = scan.nextInt();
            int m = 0;
            if (n % (a + b) <= a && n % (a + b) != 0) {
                m++;
            }
            if (n % (c + d) <= c && n % (c + d) != 0) {
                m++;
            }
            System.out.println(m);
        }
        scan.close();
    }
}
