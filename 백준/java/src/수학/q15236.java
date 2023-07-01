package 수학;

import java.util.Scanner;

public class q15236 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                r += i;
                r += j;
            }
        }
        System.out.println(r);
    }
}
