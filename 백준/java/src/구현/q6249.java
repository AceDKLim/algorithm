package 구현;

import java.util.Scanner;

public class q6249 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int h = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();
            if (r < p) {
                System.out.printf("NTV: Dollar dropped by %d Oshloobs\n", p - r);
            } else if (r > h) {
                System.out.printf("BBTV: Dollar reached %d Oshloobs, A record!\n", r);
                h = r;
            }
            p = r;
        }
        scan.close();
    }
}
