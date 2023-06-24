package 기하학;

import java.util.Scanner;

public class q4349 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        for (int i = 0; i < c; i++) {
            int result = 99999999;
            int n = scan.nextInt();
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    for (int k = j; k <= n; k++) {
                        if ((n / j) % k == 0) {
                            int a = n / j / k;
                            int r = 2 * j * k + 2 * a * k + 2 * a * j;
                            result = Math.min(result, r);
                        }
                    }
                }
            }
            System.out.println(result);
        }
        scan.close();
    }
}
