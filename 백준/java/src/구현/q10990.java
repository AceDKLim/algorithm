package 구현;

import java.util.Scanner;

public class q10990 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int ob = n - 2;
        int ib = 1;
        for (int i = 0; i < ob + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < ob; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < ib; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            ob--;
            ib += 2;
        }
    }
}
