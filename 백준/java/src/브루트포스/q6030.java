package 브루트포스;

import java.util.Scanner;

public class q6030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        scan.close();
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= q; j++) {
                if (p % i == 0 && q % j == 0) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
