package rampup;

import java.util.Arrays;
import java.util.Scanner;

class InputOutputForSecondLargest {
    int[] arr;

    public int getSecondLargestNumber() {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public boolean setArr(int[] arr) {
        if (arr.length < 2) {
            System.out.println("No Second Element Available");
            return false;
        }
        this.arr = arr;
        return true;
    }
}

public class SecondLargestInArray {
    public static void main(String[] args) {
        int n;
        int i = 0;
        int[] arr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number of pocket:-");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter " + n + " number:-");
        for (; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        InputOutputForSecondLargest inputOutputForSecondLargest = new InputOutputForSecondLargest();
        if (inputOutputForSecondLargest.setArr(arr)) {
            System.out.println("Second Largest Number Is:- " + inputOutputForSecondLargest.getSecondLargestNumber());
        }

    }
}
