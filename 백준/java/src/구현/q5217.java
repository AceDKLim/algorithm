package 구현;

import java.util.Scanner;

public class q5217 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int c = 0;
            System.out.printf("Pairs for %d: ", n);
            for (int j = 1; j < n / 2 + 1; j++) {
                if (n - j != j) {
                    if (c == 1) {
                        System.out.print(", ");
                    }
                    System.out.print(j + " " + (n - j));
                    c = 1;
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
