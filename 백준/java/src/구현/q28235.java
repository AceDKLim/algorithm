package 구현;

import java.util.Scanner;

public class q28235 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        if (n.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (n.equals("CODE")) {
            System.out.println("MASTER");
        } else if (n.equals("2023")) {
            System.out.println("0611");
        } else if (n.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }
        scan.close();
    }
}
