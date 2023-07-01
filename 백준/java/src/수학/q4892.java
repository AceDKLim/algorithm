package 수학;

import java.util.Scanner;

public class q4892 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 1;
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            } else if (n % 2 == 1) {
                System.out.printf("%d. odd %d\n", c, n / 2);
            } else {
                System.out.printf("%d. even %d\n", c, n / 2);
            }
            c++;
        }
        scan.close();
    }
}
