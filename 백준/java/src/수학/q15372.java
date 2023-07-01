package 수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q15372 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long t = Long.parseLong(bf.readLine());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(bf.readLine());
            bw.write(Long.toString(n * n) + '\n');
        }
        bw.flush();
        bw.close();
    }
}