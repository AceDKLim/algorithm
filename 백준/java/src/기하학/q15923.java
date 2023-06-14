package 기하학;

import java.util.Scanner;

public class q15923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double result = 0.0;
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double a = x;
        double b = y;
        for (int i = 0; i < n - 1; i++) {
            double nx = scan.nextDouble();
            double ny = scan.nextDouble();
            result += Math.sqrt(Math.pow(x - nx, 2) + Math.pow(y - ny, 2));
            x = nx;
            y = ny;
        }
        result += Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
        System.out.println((int) result);
        scan.close();
    }

}
