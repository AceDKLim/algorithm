package 문자열;

import java.util.Scanner;

public class q11367 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String n = scan.next();
            int g = scan.nextInt();
            int f = g / 10;
            int s = g % 10;
            String r = f == 9 || f == 10 ? "A" : f == 8 ? "B" : f == 7 ? "C" : f == 6 ? "D" : "F";
            r = (s >= 7 || g == 100) && f >= 6 ? r + "+" : r;
            System.out.println(n + " " + r);
        }
        scan.close();
    }
}
