package 수학;

import java.util.Scanner;

public class q13496 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        for (int i = 0; i < c; i++) {
            int n = scan.nextInt();
            int s = scan.nextInt();
            int d = scan.nextInt();
            int t = s * d;
            int r = 0;
            for (int j = 0; j < n; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                if (t >= a) {
                    r += b;
                }
            }
            System.out.println("Data Set " + (i + 1) + ":");
            System.out.println(r);
            System.out.println();
        }
        scan.close();
    }
}
