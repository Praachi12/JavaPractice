package String;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String ab = A.substring(0, 1).toUpperCase();
        String ab1 = B.substring(0, 1).toUpperCase();
        System.out.println(ab + A.substring(1) + " " + ab1 + B.substring(1));
    }
}
