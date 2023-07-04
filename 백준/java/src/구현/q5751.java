package 구현;

import java.util.Scanner;

public class q5751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int m = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (scan.nextInt() == 0) {
                    m++;
                } else {
                    j++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times\n", m, j);
        }
        scan.close();
    }
}
