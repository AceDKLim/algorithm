package 문자열;

import java.util.Scanner;

public class q28704 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int cnt[] = new int[5];
        String mobis = "MOBIS";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (s.charAt(i) == mobis.charAt(j)) {
                    cnt[j] = 1;
                }
            }
        }
        int result = 0;
        for (int i : cnt) {
            result += i;
        }
        if (result == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
