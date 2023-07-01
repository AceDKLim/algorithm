package 수학;

import java.util.Scanner;

public class q11109 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int d = scan.nextInt();
            int n = scan.nextInt();
            int s = scan.nextInt();
            int p = scan.nextInt();
            s *= n;
            p *= n;
            p += d;
            if (s > p) {
                System.out.println("parallelize");
            } else if (p > s) {
                System.out.println("do not parallelize");
            } else {
                System.out.println("does not matter");
            }
        }
        scan.close();
    }
}
