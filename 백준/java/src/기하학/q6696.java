package 기하학;

import java.util.Scanner;

public class q6696 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            if (x == 0 && y == 0) {
                break;
            }
            double n = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            double t = 0;
            double m = 0;
            double r = 0;
            while (n > r) {
                t += 1;
                m += 100;
                r = Math.sqrt(m / Math.PI);
            }
            System.out.println("The property will be flooded in hour " + (int) t + ".");
        }
        scan.close();
    }
}
