package rampup;

import java.util.Arrays;
import java.util.Scanner;

class InputOutputForArray {
    int[] arr;

    public int getArraySum() {
        return Arrays.stream(arr).reduce(0, (number1, number2) -> number1 + number2);
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}

public class AddElementOfArray {
    public static void main(String[] args) {
        int n;
        int i = 0;
        int[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number of pocket:-");
        n = sc.nextInt();
        arr = new int[n];
        for (; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        InputOutputForArray inputOutputForArray = new InputOutputForArray();
        inputOutputForArray.setArr(arr);
        System.out.println(inputOutputForArray.getArraySum());
    }
}
