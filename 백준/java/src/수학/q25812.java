package 수학;

import java.util.Scanner;

public class q25812 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int fixr = 0;
        int doubler = 0;
        for (int i = 0; i < n; i++) {
            int c = scan.nextInt();
            if (2 * c > c + r) {
                doubler++;
            } else if (2 * c < c + r) {
                fixr++;
            }
        }
        scan.close();
        int p = doubler == fixr ? 0 : doubler > fixr ? 2 : 1;
        System.out.println(p);
    }
}
