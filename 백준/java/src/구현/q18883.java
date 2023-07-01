package 구현;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class q18883 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = scan.nextInt();
        int m = scan.nextInt();
        int r = 1;
        scan.close();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == m) {
                    bw.write(r + "\n");
                } else {
                    bw.write(r + " ");
                }
                r++;
            }
        }
        bw.flush();
        bw.close();
    }
}
