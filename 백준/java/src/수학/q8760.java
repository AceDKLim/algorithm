package 수학;

import java.util.Scanner;

public class q8760 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        for (int i = 0; i < z; i++) {
            int w = scan.nextInt();
            int k = scan.nextInt();
            int r = 0;
            while (k >= 2) {
                k -= 2;
                r += w;
            }
            while (w >= 2) {
                w -= 2;
                r += k;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
