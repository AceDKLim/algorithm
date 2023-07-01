package 구현;

import java.util.Scanner;

public class q11800 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] x = { "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh" };
        String[] y = { "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh" };
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;
            if (a == b) {
                System.out.printf("Case %d: %s\n", i, y[a]);
            } else {
                if (a < b) {
                    int t = a;
                    a = b;
                    b = t;
                }
                if (a == 5 && b == 4) {
                    System.out.printf("Case %d: Sheesh Beesh\n", i);
                } else {
                    System.out.printf("Case %d: %s %s\n", i, x[a], x[b]);
                }
            }
        }
        scan.close();
    }
}
