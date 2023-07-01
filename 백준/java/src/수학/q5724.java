package 수학;

import java.util.Scanner;

public class q5724 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int r = 0;
            for (int i = 1; i <= n; i++) {
                r += i * i;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
