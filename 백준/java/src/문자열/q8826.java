package 문자열;

import java.util.Scanner;

public class q8826 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int c = scan.nextInt();
            int n = 0;
            int s = 0;
            int w = 0;
            int e = 0;
            String r = scan.next();
            for (int j = 0; j < c; j++) {
                if (r.charAt(j) == 'E') {
                    if (w > 0) {
                        w--;
                    } else {
                        e++;
                    }
                } else if (r.charAt(j) == 'W') {
                    if (e > 0) {
                        e--;
                    } else {
                        w++;
                    }
                } else if (r.charAt(j) == 'N') {
                    if (s > 0) {
                        s--;
                    } else {
                        n++;
                    }
                } else if (r.charAt(j) == 'S') {
                    if (n > 0) {
                        n--;
                    } else {
                        s++;
                    }
                }
            }
            System.out.println(n + s + w + e);
        }
        scan.close();
    }
}
