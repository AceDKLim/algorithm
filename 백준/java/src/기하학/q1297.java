package 기하학;

import java.util.Scanner;

public class q1297 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        double h = scan.nextDouble();
        double w = scan.nextDouble();
        double x = Math.sqrt(Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)));
        h = Math.floor(h * x);
        w = Math.floor(w * x);
        System.out.println((int) h + " " + (int) w);
        scan.close();
    }
}
