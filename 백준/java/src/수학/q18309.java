package 수학;

import java.util.Scanner;

public class q18309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mi = 50;
        int ma = -50;
        while (scan.hasNext()) {
            String[] s = scan.nextLine().split(" ");
            for (int i = 1; i < s.length; i++) {
                mi = Math.min(Integer.parseInt(s[i]), mi);
                ma = Math.max(Integer.parseInt(s[i]), ma);
            }
        }
        scan.close();
        System.out.println(mi + " " + ma);
    }
}
