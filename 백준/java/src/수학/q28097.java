package 수학;

import java.util.Scanner;

public class q28097 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = (n - 1) * 8;
        for (int i = 0; i < n; i++) {
            t += scan.nextInt();
        }
        scan.close();
        System.out.println((t / 24) + " " + (t % 24));
    }
}
