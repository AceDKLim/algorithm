package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q15784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] q = br.readLine().split(" ");
        int n = Integer.parseInt(q[0]);
        int a = Integer.parseInt(q[1]) - 1;
        int b = Integer.parseInt(q[2]) - 1;
        int m = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            String[] p = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                int t = Integer.parseInt(p[j]);
                if (i == a && j == b) {
                    k = t;
                }
                if (i == a || j == b) {
                    m = Math.max(m, t);
                }
            }
        }
        if (m == k) {
            System.out.println("HAPPY");
        } else {
            System.out.println("ANGRY");
        }
    }
}
