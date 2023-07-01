package 수학;

import java.util.Scanner;

public class q8932 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int r = 0;
            r += Math.floor(9.23076 * Math.pow(Math.abs(scan.nextInt() - 26.7), 1.835));
            r += Math.floor(1.84523 * Math.pow(Math.abs(scan.nextInt() - 75), 1.348));
            r += Math.floor(56.0211 * Math.pow(Math.abs(scan.nextInt() - 1.5), 1.05));
            r += Math.floor(4.99087 * Math.pow(Math.abs(scan.nextInt() - 42.5), 1.81));
            r += Math.floor(0.188807 * Math.pow(Math.abs(scan.nextInt() - 210), 1.41));
            r += Math.floor(15.9803 * Math.pow(Math.abs(scan.nextInt() - 3.8), 1.04));
            r += Math.floor(0.11193 * Math.pow(Math.abs(scan.nextInt() - 254), 1.88));
            System.out.println(r);
        }
        scan.close();
    }
}
