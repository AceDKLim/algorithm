package 기하학;

import java.util.Scanner;

public class q16728 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            int s = 10;
            for (int d = 10; d <= 190; d += 20) {
                if (d >= r) {
                    break;
                }
                s -= 1;
            }
            result += s;
        }
        System.out.println(result);
        scan.close();
    }
}
