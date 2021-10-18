import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListInput {
    ArrayList<String> arrayList = new ArrayList<>();

    ArrayListInput(List<String> list) {
        arrayList.addAll(list);
    }

    void traverseArrayList() {
        arrayList.stream().forEach(System.out::println);
    }
}

public class TraverseArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "efgh", "ijkl");
        ArrayListInput obj = new ArrayListInput(list);
        obj.traverseArrayList();

    }
}
