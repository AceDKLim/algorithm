package 수학;

import java.util.Scanner;

public class q27855 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = 0;
        int b = 0;
        h += scan.nextInt() * 3;
        h += scan.nextInt();
        b += scan.nextInt() * 3;
        b += scan.nextInt();
        scan.close();
        if (h == b) {
            System.out.println("NO SCORE");
        } else {
            if (h > b) {
                h -= b;
                System.out.println("1 " + h);
            } else {
                b -= h;
                System.out.println("2 " + b);
            }

        }
    }
}
