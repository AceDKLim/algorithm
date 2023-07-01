package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q28014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int m = 0;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(s[i]);
            if (t >= m) {
                cnt++;
            }
            m = t;
        }
        br.close();
        System.out.println(cnt);
    }
}