package 기하학;

import java.util.Scanner;

public class q9449 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double W = scan.nextDouble();
        double H = scan.nextDouble();
        double w = scan.nextDouble();
        double h = scan.nextDouble();

        double nw = w - 0.000000001;
        double nh = h - 0.000000001;

        long row = 0;
        while (W - w >= 0) {
            W -= w + nw;
            row++;
        }

        long colum = 0;
        while (H - h >= 0) {
            H -= h + nh;
            colum++;
        }

        System.out.println(row * colum);
        scan.close();
    }
}
