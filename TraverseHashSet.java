import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class InputOutput {
    HashSet<Integer> hashSet = new HashSet<>();

    InputOutput(List<Integer> list) {
        hashSet.addAll(list);
    }

    void traverseHashSet() {
        hashSet.stream().forEach(System.out::println);
    }
}

public class TraverseHashSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 43, 65, 23, 5412, 76, 2312, 12, 1);
        InputOutput obj = new InputOutput(list);
        obj.traverseHashSet();
    }
}
