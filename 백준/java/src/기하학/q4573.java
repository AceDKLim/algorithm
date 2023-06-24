package 기하학;

import java.util.Scanner;

public class q4573 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            double pizza = 999999999;
            int rr = 0;
            for (int i = 0; i < n; i++) {
                int r = scan.nextInt();
                int p = scan.nextInt();
                double w = (r / 2) * (r / 2) * Math.PI;
                System.out.println(p / w);
                if (pizza > (double) p / w) {
                    pizza = w;
                    rr = r;
                }
            }
            System.out.println(String.format("Menu %d: %d", cnt, rr));
            cnt++;
        }
        scan.close();
    }
}
