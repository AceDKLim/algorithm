package 기하학;

import java.util.Scanner;

public class q16478 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ab = scan.nextInt();
        double bc = scan.nextInt();
        double cd = scan.nextInt();
        System.out.println(ab * cd / bc);
        scan.close();
    }
}
