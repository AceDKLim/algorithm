package 구현;

import java.util.Scanner;

public class q26535 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = (int) Math.ceil(Math.sqrt(scan.nextInt()));
        scan.close();
        for (int i = 0; i < n + 2; i++) {
            System.out.print("x");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("x");
            for (int j = 0; j < n; j++) {
                System.out.print(".");
            }
            System.out.println("x");
        }
        for (int i = 0; i < n + 2; i++) {
            System.out.print("x");
        }
    }
}
