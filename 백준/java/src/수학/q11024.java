package 수학;

import java.util.Scanner;

public class q11024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int r = 0;
            String[] s = scan.nextLine().split(" ");
            for (String j : s) {
                r += Integer.parseInt(j);
            }
            System.out.println(r);
        }
        scan.close();
    }
}
