package 수학;

import java.util.Scanner;

public class q26592 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            System.out.println(String.format("The height of the triangle is %.2f units", 2 * a / b));
        }
        scan.close();
    }
}
