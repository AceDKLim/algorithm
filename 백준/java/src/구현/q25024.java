package 구현;

import java.util.Scanner;

public class q25024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            String r1 = x <= 23 && y <= 59 ? "Yes" : "No";
            String r2 = x >= 1 && x <= 12 && y >= 1 ? (x == 4 || x == 6 || x == 9 || x == 11) && y <= 30 ? "Yes"
                    : x == 2 && y <= 29 ? "Yes"
                            : (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) && y <= 31 ? "Yes"
                                    : "No"
                    : "No";
            System.out.println(r1 + " " + r2);
        }
        scan.close();
    }
}
