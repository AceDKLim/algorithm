package 구현;

import java.util.Scanner;

public class q25285 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            double h = scan.nextDouble();
            double w = scan.nextDouble();
            double b = w / (h * h) * 10000;
            int r = h < 140.1 ? 6 : h < 146 ? 5 : h < 159 ? 4 : h >= 204 ? 4 : 7;
            r = r == 7
                    ? h < 161 ? b < 16 || b >= 35 ? 4 : 3
                            : b < 16 || b >= 35 ? 4 : b < 18.5 || b >= 30 ? 3 : b < 20 || b >= 25 ? 2 : 1
                    : r;
            System.out.println(r);
        }
        scan.close();
    }
}
