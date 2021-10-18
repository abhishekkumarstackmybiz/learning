class InputOutputForArray<T> {
    T[] arr;

    InputOutputForArray(T[] arr) {
        this.arr = arr;
    }

    void exchangePosition(int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    void showArrayValue() {
        for (T one : arr) {
            System.out.println(one);
        }
    }
}

public class ExchangePositionInArray {
    public static void main(String[] args) {
        Integer[] arr = {34, 65, 76, 23, 12, 89};
        InputOutputForArray<Integer> obj = new InputOutputForArray<>(arr);
        obj.exchangePosition(2, 4);
        obj.showArrayValue();

        Double[] arr1 = {34.44, 65.5, 76.67, 23.23, 12.11, 89.89};
        InputOutputForArray<Double> obj1 = new InputOutputForArray<>(arr1);
        obj1.exchangePosition(3, 5);
        obj1.showArrayValue();
    }
}
