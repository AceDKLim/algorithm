package 구현;

import java.util.Scanner;

public class q23809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] g = { 3, 2, 0, 2, 3 };
        scan.close();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }
                for (int k = 0; k < n * g[i]; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }
                if (i == 2) {
                    for (int k = 0; k < n; k++) {
                        System.out.print("@");
                    }
                }
                System.out.println();
            }
        }
    }
}
