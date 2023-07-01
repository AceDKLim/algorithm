package 수학;

import java.util.Scanner;

public class q10474 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            System.out.printf("%d %d / %d\n", x / y, x % y, y);
        }
        scan.close();
    }
}
