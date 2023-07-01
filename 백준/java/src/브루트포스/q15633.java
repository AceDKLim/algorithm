package 브루트포스;

import java.util.Scanner;

public class q15633 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                r += i;
            }
        }
        System.out.println(r * 5 - 24);
    }
}
