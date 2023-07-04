package 구현;

import java.util.Scanner;

public class q27481 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] r = new int[10];
        int n = scan.nextInt();
        String[] s = scan.next().split("");
        scan.close();
        for (int i = 0; i < n; i++) {
            if (s[i].equals("L")) {
                for (int j = 0; j < 10; j++) {
                    if (r[j] == 0) {
                        r[j] = 1;
                        break;
                    }
                }
            } else if (s[i].equals("R")) {
                for (int j = 9; j >= 0; j--) {
                    if (r[j] == 0) {
                        r[j] = 1;
                        break;
                    }
                }
            } else {
                r[Integer.parseInt(s[i])] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(r[i]);
        }
    }
}
