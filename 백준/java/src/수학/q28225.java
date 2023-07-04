package 수학;

import java.util.Scanner;

public class q28225 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f = scan.nextInt();
        int r = 0;
        double t = 1000;
        for (int i = 0; i < n; i++) {
            int x = f - scan.nextInt();
            int y = scan.nextInt();
            double c = (double) x / y;
            if (c < t) {
                r = i + 1;
                t = c;
            }
        }
        scan.close();
        System.out.println(r);
    }
}
