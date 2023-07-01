package 수학;

import java.util.Scanner;

public class q27245 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float w = scan.nextFloat();
        float l = scan.nextFloat();
        float h = scan.nextFloat();
        scan.close();
        if (w < l) {
            float t = l;
            l = w;
            w = t;
        }
        String r = "good";
        if (l / h < 2) {
            r = "bad";
        } else if (w / l > 2) {
            r = "bad";
        }
        System.out.println(r);
    }
}
