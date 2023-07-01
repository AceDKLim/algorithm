package 문자열;

import java.util.Scanner;

public class q18698 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'U') {
                    cnt++;
                } else {
                    break;
                }
            }
            System.out.println(cnt);
        }
        scan.close();
    }
}
