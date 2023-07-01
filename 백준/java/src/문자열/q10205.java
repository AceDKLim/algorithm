package 문자열;

import java.util.Scanner;

public class q10205 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.printf("Data Set %d:\n", i);
            int n = scan.nextInt();
            String s = scan.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'c') {
                    n++;
                } else {
                    n--;
                }
            }
            System.out.println(n);
            System.out.println();
        }
        scan.close();
    }
}
