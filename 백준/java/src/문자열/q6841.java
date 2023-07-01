package 문자열;

import java.util.HashMap;
import java.util.Scanner;

public class q6841 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> r = new HashMap<String, String>();
        r.put("CU", "see you");
        r.put(":-)", "I\u2019m happy");
        r.put(":-(", "I\u2019m unhappy");
        r.put(";-)", "wink");
        r.put(":-P", "stick out my tongue");
        r.put("(~.~)", "sleepy");
        r.put("TA", "totally awesome");
        r.put("CCC", "Canadian Computing Competition");
        r.put("CUZ", "because");
        r.put("TY", "thank-you");
        r.put("YW", "you\u2019re welcome");
        r.put("TTYL", "talk to you later");

        while (true) {
            String n = scan.next();
            String a = r.get(n);

            if (a == null) {
                System.out.println(n);
            } else {
                System.out.println(a);
            }

            if (n.equals("TTYL")) {
                break;
            }
        }
        scan.close();
    }
}
