package 수학;

import java.util.Scanner;

public class q5102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int c = a - b;
            int r = 0;
            int t = 0;
            if (c % 2 != 0 && c > 2) {
                c -= 3;
                t = 1;
            }
            r += c / 2;

            System.out.println(r + " " + t);
        }
        scan.close();
    }
}
