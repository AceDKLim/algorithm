package 수학;

import java.util.Scanner;

public class q1703 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            if (a == 0) {
                break;
            }
            int r = 1;
            for (int i = 0; i < a; i++) {
                r *= scan.nextInt();
                r -= scan.nextInt();
            }
            System.out.println(r);
        }
        scan.close();
    }
}
