package 구현;

import java.util.Scanner;

public class q10992 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sb = n - 2;
        int nb = 1;

        if (n != 1) {
            for (int j = 0; j < sb + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < sb; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < nb; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            sb--;
            nb += 2;
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
    }
}
