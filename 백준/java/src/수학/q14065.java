package 수학;

import java.util.Scanner;

public class q14065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        scan.close();
        System.out.println(3.785411784 * 100 / 1.609344 / n);
    }
}
