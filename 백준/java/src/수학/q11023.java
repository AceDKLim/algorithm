package 수학;

import java.util.Scanner;

public class q11023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] n = scan.nextLine().split(" ");
        scan.close();
        int r = 0;
        for (String i : n) {
            r += Integer.parseInt(i);
        }
        System.out.println(r);
    }
}
