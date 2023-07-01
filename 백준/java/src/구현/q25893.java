package 구현;

import java.util.Scanner;

public class q25893 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int[] b = new int[3];
            for (int j = 0; j < 3; j++) {
                b[j] = scan.nextInt();
                if (b[j] >= 10) {
                    cnt++;
                }
            }
            String[] r = { "zilch", "double", "double-double", "triple-double" };
            for (int j = 0; j < 3; j++) {
                System.out.print(b[j] + " ");
            }
            System.out.println();
            System.out.println(r[cnt]);
            System.out.println();
        }
        scan.close();
    }
}
