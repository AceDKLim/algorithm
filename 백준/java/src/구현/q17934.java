package 구현;

import java.util.Scanner;

public class q17934 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] num = new int[3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                num[j] = scan.nextInt();
            }
        }
        n = n + 2;
        scan.close();
        if (m >= 8) {
            System.out.println("satisfactory");
        } else {
            System.out.println("unsatisfactory");
        }
    }
}
