package 브루트포스;

import java.util.Scanner;

public class q20410 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int s = scan.nextInt();
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        scan.close();
        int a = 0;
        int c = 0;
        Boolean r = false;
        for (int i = 0; i < m; i++) {
            if (r == true) {
                break;
            }
            for (int j = 0; j < m; j++) {
                if (x1 == (i * s + j) % m && x2 == (i * x1 + j) % m) {
                    a = i;
                    c = j;
                    r = true;
                    break;
                }
            }
        }
        System.out.println(a + " " + c);
    }
}
