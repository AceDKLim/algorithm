package 구현;

import java.util.Scanner;

public class q23810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5 * n; k++) {
                    System.out.print("@");
                }
                System.out.println();
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
