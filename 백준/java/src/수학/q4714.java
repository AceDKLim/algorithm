package 수학;

import java.util.Scanner;

public class q4714 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            float n = scan.nextFloat();
            if (n == -1) {
                break;
            }
            System.out
                    .println(
                            String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.", n, n * 0.167));
        }
        scan.close();
    }
}
