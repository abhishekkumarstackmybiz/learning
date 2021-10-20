package rampup;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose From Given Menu:-");
            System.out.println("1.abc \n2.cde \n3.efg");
            System.out.println("Dop You Want To Continue(y/n):-");
            ch = sc.next().charAt(0);
        } while (toLowerCase(ch) == 'y');
        System.out.println("Thank You For Using");
    }
}
