package 수학;

import java.util.Scanner;

public class q4766 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n = scan.nextFloat();
        while (true) {
            float m = scan.nextFloat();
            if (m == 999) {
                break;
            }
            System.out.printf("%.2f\n", m - n);
            n = m;
        }
        scan.close();
    }
}
