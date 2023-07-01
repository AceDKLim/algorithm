package 수학;

import java.util.Scanner;

public class q5101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            long s = scan.nextLong();
            long g = scan.nextLong();
            long e = scan.nextLong() - s;
            if (s == 0 && g == 0 && e == 0) {
                break;
            }
            if (e % g == 0) {
                System.out.println(e / g + 1);
            } else {
                System.out.println("X");
            }
        }
        scan.close();
    }
}
