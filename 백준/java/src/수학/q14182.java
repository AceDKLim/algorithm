package 수학;

import java.util.Scanner;

public class q14182 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int r = n <= 1000000 ? n : n <= 5000000 ? n / 10 * 9 : n / 10 * 8;
            System.out.println(r);
        }
        scan.close();
    }
}
