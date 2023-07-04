package 구현;

import java.util.Scanner;

public class q17588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scan.nextInt();
        }
        scan.close();
        int c = 0;
        for (int i = 1; i <= r[n - 1]; i++) {
            if (r[c] == i) {
                c++;
            } else {
                System.out.println(i);
            }
        }
        if (r[n - 1] == n) {
            System.out.println("good job");
        }
    }
}
