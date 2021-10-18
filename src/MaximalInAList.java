import java.util.*;

class InputOutputForMaximal<T> {
    List<T> list = new ArrayList<>();

    InputOutputForMaximal(List<T> elements) {
        list.addAll(elements);
    }

    T maxInRange(int begin, int end) {
        List<T> subList = list.subList(begin, end);
        return Collections.max(subList, null);
    }
}

public class MaximalInAList {
    public static void main(String[] args) {
        InputOutputForMaximal<Integer> obj = new InputOutputForMaximal<>(Arrays.asList(20, 40, 1, 23, 21, 40, 56, 40, 36, 37));
        System.out.println(obj.maxInRange(2, 6));

        InputOutputForMaximal<Double> obj1 = new InputOutputForMaximal<>(Arrays.asList(2.0, 40.4, 1.6, 23.76, 0.21, 4.50, 56.56, 36.3, 37.4));
        System.out.println(obj1.maxInRange(2, 6));

        InputOutputForMaximal<Long> obj2 = new InputOutputForMaximal<>(Arrays.asList(2L, 404L, 16L, 2376L, 21L, 450L, 5656L, 36L, 37L));
        System.out.println(obj2.maxInRange(2, 6));

    }
}
