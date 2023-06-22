package 기하학;

import java.util.Scanner;

public class q1235 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuffer t = new StringBuffer(scan.nextLine());
            nums[i] = t.reverse().toString();
        }
        int cnt = 1;
        while (true) {
            int t = 0;
            String[] cut = new String[n];
            for (int i = 0; i < n; i++) {
                String k = "";
                for (int j = 1; j < cnt + 1; j++) {
                    k += nums[i].charAt(j);
                }
                cut[i] = k;
                for (int j = 0; j < i; j++) {
                    if (cut[i] == cut[j]) {
                        t++;
                    }
                }

            }
            if (t == 0) {
                break;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
        scan.close();
    }
}
