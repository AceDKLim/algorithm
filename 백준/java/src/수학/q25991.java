package 수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q25991 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        double r = 0;
        String[] num = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            double t = Double.parseDouble(num[i]);
            r += (t * t * t);
        }
        bw.write(Double.toString(Math.cbrt(r)));
        bw.flush();
        bw.close();
    }
}
