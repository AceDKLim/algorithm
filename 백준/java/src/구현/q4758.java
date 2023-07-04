package 구현;

import java.util.Scanner;

public class q4758 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            float s = scan.nextFloat();
            int w = scan.nextInt();
            int p = scan.nextInt();
            if (s == 0 && w == 0 && p == 0) {
                break;
            }
            String r = "";
            if (s <= 4.5 && w >= 150 && p >= 200) {
                r += "Wide Receiver ";
            }
            if (s <= 6 && w >= 300 && p >= 500) {
                r += "Lineman ";
            }
            if (s <= 5 && w >= 200 && p >= 300) {
                r += "Quarterback ";
            }
            if (r == "") {
                System.out.println("No positions");
            } else {
                System.out.println(r);
            }
        }
        scan.close();
    }
}
