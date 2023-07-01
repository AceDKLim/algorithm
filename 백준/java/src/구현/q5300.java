package 구현;

import java.util.Scanner;

public class q5300 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0) {
                System.out.print("Go! ");
            }
        }
        if (n % 6 != 0) {
            System.out.print("Go! ");
        }
    }
}
