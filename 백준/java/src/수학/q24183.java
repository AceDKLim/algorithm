package 수학;

import java.util.Scanner;

public class q24183 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble() / 10000;
        double y = scan.nextDouble() / 10000;
        double z = scan.nextDouble() / 10000;
        scan.close();
        double a = 22.9 * 32.4 * 2;
        double b = 29.7 * 42 * 2;
        double c = 21 * 29.7;
        System.out.println(x * a + y * b + z * c);
    }
}
