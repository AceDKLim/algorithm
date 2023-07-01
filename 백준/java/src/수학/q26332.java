package 수학;

import java.util.Scanner;

public class q26332 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int c = scan.nextInt();
            int p = scan.nextInt();
            int r = c * p - 2 * (c - 1);
            System.out.println(c + " " + p);
            System.out.println(r);
        }
        scan.close();
    }
}
