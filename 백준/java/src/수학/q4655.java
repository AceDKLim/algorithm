package 수학;

import java.util.Scanner;

public class q4655 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            float n = scan.nextFloat();
            if (n == 0) {
                break;
            }
            long c = 0;
            double r = 0;
            long i = 2;
            while (r < n) {
                r += (double) 1 / i;
                i++;
                c++;
            }
            System.out.println(c + " card(s)");
        }
        scan.close();
    }
}
