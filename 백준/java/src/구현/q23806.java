package 구현;

import java.util.Scanner;

public class q23806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5 * n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 0; i < 5 * n - 2 * n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("@");
            }
            for (int j = 0; j < 5 * n - 2 * n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5 * n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
