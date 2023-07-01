package 수학;

import java.util.Scanner;

public class q4880 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if (b - a == c - b) {
                System.out.printf("AP %d\n", c + b - a);
            } else if (b / a == c / b) {
                System.out.printf("GP %d\n", c * b / a);
            }
        }
        scan.close();
    }
}
