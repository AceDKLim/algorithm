package 수학;

import java.util.Scanner;

public class q13670 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int h1 = scan.nextInt();
            int m1 = scan.nextInt();
            int h2 = scan.nextInt();
            int m2 = scan.nextInt();
            if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                break;
            }
            int h = h2 - h1;
            int m = m2 - m1;
            if (m < 0) {
                m += 60;
                h--;
            }
            if (h < 0) {
                h += 24;
            }
            System.out.println(h * 60 + m);
        }
        scan.close();
    }
}
