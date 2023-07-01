package 수학;

import java.util.Scanner;

public class q20867 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int s = scan.nextInt();
        int g = scan.nextInt();
        float a = 1 / scan.nextFloat();
        float b = 1 / scan.nextFloat();
        int l = scan.nextInt();
        int r = scan.nextInt();
        scan.close();

        float lr = (a * l) + m / g;
        float rr = (b * r) + m / s;
        if (lr < rr) {
            System.out.println("friskus");
        } else {
            System.out.println("latmask");
        }
    }
}
