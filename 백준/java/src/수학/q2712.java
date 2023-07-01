package 수학;

import java.util.Scanner;

public class q2712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            float n = scan.nextFloat();
            String d = scan.next();
            if (d.equals("kg")) {
                System.out.printf("%.4f lb\n", n * 2.2046);
            } else if (d.equals("lb")) {
                System.out.printf("%.4f kg\n", n * 0.4536);
            } else if (d.equals("l")) {
                System.out.printf("%.4f g\n", n * 0.2642);
            } else if (d.equals("g")) {
                System.out.printf("%.4f l\n", n * 3.7854);
            }
        }
        scan.close();
    }
}
