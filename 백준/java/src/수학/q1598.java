package 수학;

import java.util.Scanner;

public class q1598 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int x = a % 4 == 0 ? a / 4 : a / 4 + 1;
        int y = b % 4 == 0 ? b / 4 : b / 4 + 1;
        int w = Math.abs(x - y);
        int h = Math.abs((4 * x - a) - (4 * y - b));
        System.out.println(w + h);
    }
}
