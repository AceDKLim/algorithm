package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q3273 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scan.nextInt();
        }
        Arrays.sort(l);
        int t = scan.nextInt();
        int s = 0;
        int e = n - 1;
        int cnt = 0;
        while (s < e) {
            int p = l[s] + l[e];
            if (p == t) {
                cnt++;
                s++;
            } else if (p < t) {
                e--;
            } else {
                s++;
            }
        }
        System.out.println(cnt);
        scan.close();
    }
}
