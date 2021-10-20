package rampup;

import java.util.Scanner;

class ReverseANumberImpl {
    int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void printReverse() {
        int reverse = 0;
        for (; number > 0; number /= 10) {
            reverse = reverse * 10 + number % 10;
        }
        System.out.println(reverse);
    }
}

public class ReverseANumberForLoop {
    public static void main(String[] args) {
        ReverseANumberImpl reverseANumberImpl = new ReverseANumberImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number:-");
        reverseANumberImpl.setNumber(sc.nextInt());
        reverseANumberImpl.printReverse();
    }
}
