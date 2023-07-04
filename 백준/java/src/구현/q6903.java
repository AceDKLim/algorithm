package 구현;

import java.util.Scanner;

public class q6903 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
                for (int k = 0; k < b; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        for (int i = 0; i < 2 * b + 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
