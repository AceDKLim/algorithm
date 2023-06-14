package 기하학;

import java.util.Scanner;

public class q11880 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            Double x = (Math.pow(a + b, 2) + Math.pow(c, 2));
            Double y = (Math.pow(a + c, 2) + Math.pow(b, 2));
            Double z = (Math.pow(b + c, 2) + Math.pow(a, 2));
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println((int) Math.min(z, Math.min(x, y)));
        }
        scan.close();
    }
}
