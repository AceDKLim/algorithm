package 기하학;

import java.util.Scanner;

public class q20215 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double c = a + b;
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);

        double d = Math.sqrt(a + b);
        System.out.println(c - d);
        scan.close();
    }
}
