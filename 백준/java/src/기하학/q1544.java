package 기하학;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class q1544 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i <= n; i++) {
            String text = scan.nextLine();
            char[] c = text.toCharArray();
            Arrays.sort(c);
            text = new String(c);
            if (str.contains(text) == false) {
                str.add(text);
            }
        }
        System.out.println(str);
        System.out.println(str.size());
        scan.close();
    }
}
