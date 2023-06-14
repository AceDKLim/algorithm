package 기하학;

import java.util.Scanner;

public class q13222 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double w = scan.nextDouble();
        double h = scan.nextDouble();
        double l = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if (l >= t) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
