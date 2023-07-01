package 수학;

import java.util.Scanner;

public class q15080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] start = scan.nextLine().replace(" ", "").split(":");
        String[] end = scan.nextLine().replace(" ", "").split(":");
        scan.close();
        int a = Integer.parseInt(start[0]);
        int b = Integer.parseInt(end[0]);
        int h = a > b ? 24 - a + b : b - a;
        int m = Integer.parseInt(end[1]) - Integer.parseInt(start[1]);
        int s = Integer.parseInt(end[2]) - Integer.parseInt(start[2]);
        if (s < 0) {
            s += 60;
            m -= 1;
        }
        if (m < 0) {
            m += 60;
            h -= 1;
        }
        if (h > 24) {
            h -= 24;
        }
        if (h < 0) {
            h += 24;
        }
        System.out.println(3600 * h + 60 * m + s);
    }
}
