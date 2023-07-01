package 수학;

import java.util.Scanner;

public class q4696 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            float n = scan.nextFloat();
            if (n == 0) {
                break;
            } else {
                System.out.println(String.format("%.2f", 1 + n + n * n + n * n * n + n * n * n * n));
            }
        }
        scan.close();
    }
}
