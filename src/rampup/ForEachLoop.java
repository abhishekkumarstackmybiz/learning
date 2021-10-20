package rampup;

class ForEachExample {
    int arr[][] = new int[3][];

    ForEachExample() {
        arr[0] = new int[]{4, 3, 5, 6, 7};
        arr[1] = new int[]{};
        arr[2] = new int[]{9, 7};
    }

    public void showExample() {
        for (int[] arrOne : arr) {
            for (int element : arrOne) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

public class ForEachLoop {
    public static void main(String[] args) {
        ForEachExample forEachExample = new ForEachExample();
        forEachExample.showExample();
    }
}
