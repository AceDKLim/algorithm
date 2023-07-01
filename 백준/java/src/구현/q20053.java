package 구현;

import java.util.Scanner;

public class q20053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int min = 1000000;
            int max = -1000000;
            for (int j = 0; j < n; j++) {
                int num = scan.nextInt();
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            System.out.println(min + " " + max);
        }
        scan.close();
    }
}
