package 구현;

import java.util.Scanner;

public class q14909 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        scan.close();
        int r = 0;
        for (String i : s) {
            if (Integer.parseInt(i) > 0) {
                r++;
            }
        }
        System.out.println(r);
    }
}
