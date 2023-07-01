package 수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q23972 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = bf.readLine().split(" ");
        double k = Integer.parseInt(s[0]);
        double n = Integer.parseInt(s[1]);
        int r = 0;
        if (n == 1) {
            r = -1;
        } else {
            r = (int) Math.ceil((k * n) / (n - 1));
        }
        while ((r - k) * n < r) {
            r++;
        }
        bw.write(Integer.toString(r));
        bw.flush();
        bw.close();
    }
}
