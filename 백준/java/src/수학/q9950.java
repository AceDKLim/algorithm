package 수학;

import java.util.Scanner;

public class q9950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int l = scan.nextInt();
            int w = scan.nextInt();
            int a = scan.nextInt();
            if (l == 0 && w == 0 && a == 0) {
                break;
            } else if (l == 0) {
                System.out.printf("%d %d %d\n", a / w, w, a);
            } else if (w == 0) {
                System.out.printf("%d %d %d\n", l, a / l, a);
            } else if (a == 0) {
                System.out.printf("%d %d %d\n", l, w, l * w);
            }
        }
        scan.close();
    }
}
