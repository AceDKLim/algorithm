package 문자열;

import java.util.HashMap;
import java.util.Scanner;

public class q15238 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        HashMap<Character, Integer> r = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (r.containsKey(s.charAt(i))) {
                r.put(s.charAt(i), r.get(s.charAt(i)) + 1);
            } else {
                r.put(s.charAt(i), +1);
            }
        }
        int mc = 0;
        int mi = 0;
        for (char i : r.keySet()) {
            if (r.get(i) > mi) {
                mc = i;
                mi = r.get(i);
            }
        }
        System.out.printf("%c %d", mc, mi);
    }
}
