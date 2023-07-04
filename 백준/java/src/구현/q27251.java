package 구현;

import java.util.Scanner;

public class q27251 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 1; i <= n; i++) {
            if (i * i > 100) {
                for (int j = 0; j < 100; j++) {
                    System.out.print("*");
                }
                System.out.print("...");
            } else {
                for (int j = 0; j < i * i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
