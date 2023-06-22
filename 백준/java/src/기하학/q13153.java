package 기하학;

import java.util.Scanner;

public class q13153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] tri = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                tri[i][j] = scan.nextInt();
            }
        }
        float r = scan.nextFloat();
        double a = Math.sqrt(Math.pow(tri[0][0] - tri[1][0], 2) + Math.pow(tri[0][1] - tri[1][1], 2));
        double b = Math.sqrt(Math.pow(tri[1][0] - tri[2][0], 2) + Math.pow(tri[1][1] - tri[2][1], 2));
        double c = Math.sqrt(Math.pow(tri[0][0] - tri[2][0], 2) + Math.pow(tri[0][1] - tri[2][1], 2));
        double s = a + b + c;
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.pow(c, 2);
        double A = 0.25 * Math.sqrt(4 * a * b - Math.pow(a + b - c, 2));
        double nr = 2 * A / s;
        nr -= r;
        System.out.println(nr / r * 100);
        scan.close();
    }
}
