package 기하학;

import java.util.Scanner;

public class q21335 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double p = Math.PI;
        n = Math.sqrt(n / p);
        System.out.println(2 * p * n);
        scan.close();
    }
}
