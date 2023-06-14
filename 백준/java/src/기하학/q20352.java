package 기하학;

import java.util.Scanner;

public class q20352 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double p = Math.PI;
        System.out.println(2 * p * Math.sqrt(n / p));
        scan.close();
    }

}
