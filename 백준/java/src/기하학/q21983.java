package 기하학;

import java.util.Scanner;

public class q21983 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s = scan.nextDouble();
        s /= 6;
        double n = 2 * Math.sqrt(s / Math.sqrt(3));
        System.out.println(n * 6);
        scan.close();
    }
}
