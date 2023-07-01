package 수학;

import java.util.Scanner;

public class q8718 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double k = scan.nextDouble();
        scan.close();
        if (7 * k <= x) {
            System.out.println((int) (7 * k * 1000));
        } else if (3.5 * k <= x) {
            System.out.println((int) (3.5 * k * 1000));
        } else if (1.75 * k <= x) {
            System.out.println((int) (1.75 * k * 1000));
        } else {
            System.out.println(0);
        }
    }
}
