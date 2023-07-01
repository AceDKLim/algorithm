package 문자열;

import java.util.Scanner;

public class q17350 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean r = false;
        for (int i = 0; i < n; i++) {
            if (scan.next().equals("anj")) {
                r = true;
            }
        }
        scan.close();
        if (r == true) {
            System.out.println("뭐야;");
        } else {
            System.out.println("뭐야?");
        }
    }
}
