package 기하학;

import java.util.Scanner;

public class q25084 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i < t + 1; i++) {
            double r = scan.nextDouble();
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double pi = Math.PI;
            double result = 0;
            while (r > 0) {
                result += pi * Math.pow(r, 2);
                r *= a;
                result += pi * Math.pow(r, 2);
                r = Math.floor(r / b);
            }
            System.out.println("Case #" + i + ": " + result);
        }
        scan.close();
    }
}
