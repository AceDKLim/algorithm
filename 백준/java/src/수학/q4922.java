package 수학;

import java.util.Scanner;

public class q4922 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int r = n * n - n + 1;
            System.out.printf("%d => %d\n", n, r);
        }
        scan.close();
    }
}
