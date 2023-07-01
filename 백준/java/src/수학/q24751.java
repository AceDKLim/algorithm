package 수학;

import java.util.Scanner;

public class q24751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        scan.close();
        double b = 100 - a;
        System.out.println(100 / a);
        System.out.println(100 / b);
    }
}
