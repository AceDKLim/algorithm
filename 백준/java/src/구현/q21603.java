package 구현;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class q21603 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = scan.nextLong();
        long k = scan.nextLong();
        long a = k % 10;
        long b = (2 * k) % 10;
        scan.close();
        long cnt = 8 * (n / 10);
        for (int i = 1; i <= n % 10; i++) {
            if (i != a && i != b) {
                cnt++;
            }
        }
        bw.write(Long.toString(cnt) + "\n");
        for (long i = 1; i <= n; i++) {
            if (i % 10 == a || i % 10 == b) {
                continue;
            }
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}
