package 수학;

import java.util.Scanner;

public class q24803 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int g = scan.nextInt() * 3;
        int s = scan.nextInt() * 2;
        int c = scan.nextInt();
        scan.close();
        int t = g + s + c;
        String r1 = "";
        String r2 = "";
        if (t >= 8) {
            r1 = "Province";
        } else if (t >= 5) {
            r1 = "Duchy";
        } else if (t >= 2) {
            r1 = "Estate";
        }
        if (t >= 6) {
            r2 = "Gold";
        } else if (t >= 3) {
            r2 = "Silver";
        } else {
            r2 = "Copper";
        }
        if (r1 != "") {
            System.out.print(r1 + " or ");
        }
        System.out.println(r2);
    }
}
