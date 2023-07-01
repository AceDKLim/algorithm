package 수학;

import java.util.Scanner;

public class q27182 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        if (n > 7) {
            System.out.println(n - 7);
        } else {
            int t = 14 - n + m;
            if (m + 7 > t) {
                System.out.println(m + 7 - t);
            } else {
                System.out.println(m + 7);
            }
        }
    }
}
