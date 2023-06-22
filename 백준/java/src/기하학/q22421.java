package 기하학;

import java.util.Scanner;

public class q22421 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int d = scan.nextInt();
            int e = scan.nextInt();
            if (d == 0 && e == 0) {
                break;
            }
            Double r = 100000.0;
            for (int i = 0; i < (d / 2) + 1; i++) {
                int a = i;
                int b = d - i;
                Double g = Math.abs(e - Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
                r = Math.min(r, g);
            }
            System.out.println(r);
        }
        scan.close();
    }
}
