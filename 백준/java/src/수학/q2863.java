package 수학;

import java.util.Scanner;

public class q2863 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        scan.close();
        float[] r = { a / c + b / d, c / d + a / b, d / b + c / a, b / a + d / c };
        float t = 0;
        int n = 0;
        for (int i = 0; i < 4; i++) {
            if (r[i] > t) {
                t = r[i];
                n = i;
            }
        }
        System.out.println(n);
    }
}
