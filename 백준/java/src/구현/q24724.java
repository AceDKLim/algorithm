package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q24724 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= n; i++) {
            int r = Integer.parseInt(bf.readLine());
            for (int j = 0; j <= r; j++) {
                bf.readLine();
            }
            System.out.println("Material Management " + i);
            System.out.println("Classification ---- End!");
        }
    }
}
