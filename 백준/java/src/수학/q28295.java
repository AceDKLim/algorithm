package 수학;

import java.util.Scanner;

public class q28295 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] d = { "N", "E", "S", "W" };
        int r = 0;
        for (int i = 0; i < 10; i++) {
            r += scan.nextInt();
        }
        scan.close();
        r %= 4;
        System.out.println(d[r]);
    }
}
