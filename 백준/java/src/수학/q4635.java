package 수학;

import java.util.Scanner;

public class q4635 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            int c = 0;
            int r = 0;
            for (int j = 0; j < n; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                r += a * (b - c);
                c = b;
            }
            System.out.println(r + " miles");
        }
        scan.close();
    }
}
