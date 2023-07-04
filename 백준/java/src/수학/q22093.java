package 수학;

import java.util.Scanner;

public class q22093 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println((a - b) + " " + Math.min(n - b, a));
        }
        scan.close();
    }
}
