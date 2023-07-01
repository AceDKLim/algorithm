package 구현;

import java.util.Scanner;

public class q10188 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print("X");
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
