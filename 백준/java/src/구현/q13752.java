package 구현;

import java.util.Scanner;

public class q13752 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int m = scan.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        scan.close();
    }
}
