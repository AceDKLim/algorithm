package 수학;

import java.util.Scanner;

public class q27890 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < n; i++) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x *= 2;
            }
            x ^= 6;
        }
        System.out.println(x);
    }
}
