package 수학;

import java.util.Scanner;

public class q25756 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double v = 0;
        for (int i = 0; i < n; i++) {
            double a = scan.nextDouble();
            double nv = a + v + a * v;
            System.out.println(nv - v);
            v = nv;
        }
        scan.close();
    }
}
