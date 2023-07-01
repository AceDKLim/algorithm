package 수학;

import java.util.Scanner;

public class q25858 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] p = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            p[i] = scan.nextInt();
            s += p[i];
        }
        scan.close();
        d /= s;
        for (int i = 0; i < n; i++) {
            System.out.println(d * p[i]);
        }

    }
}
