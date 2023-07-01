package 구현;

import java.util.Scanner;

public class q13240 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) {
                        System.out.print(".");
                    } else {
                        System.out.print("*");
                    }
                } else if (i % 2 == 1) {
                    if (j % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
