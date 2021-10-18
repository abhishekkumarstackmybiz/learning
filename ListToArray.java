import java.util.Arrays;
import java.util.List;

class InputOutputValue {
    String[] str;

    InputOutputValue(List<String> list) {
        int i = 0;
        str = new String[list.size()];

        for (String oneItem : list) {
            str[i] = oneItem;
            i++;
        }
    }

    void printString() {
        for (String one : str) {
            System.out.println(one);
        }
    }
}

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "efgh", "ijkl");
        InputOutputValue obj = new InputOutputValue(list);
        obj.printString();
    }
}
