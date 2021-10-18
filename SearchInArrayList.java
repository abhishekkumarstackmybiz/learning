import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class InputOutputForArrayList {
    ArrayList<String> arrayList = new ArrayList<>();

    InputOutputForArrayList(List<String> list) {
        arrayList.addAll(list);
    }

    void searchElement(String searchingItem) {
        if (arrayList.contains(searchingItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

public class SearchInArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd", "efgh", "ijkl", "mno");
        InputOutputForArrayList obj = new InputOutputForArrayList(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String To Search:-");
        String searchingElement = sc.nextLine();
        obj.searchElement(searchingElement);
    }
}
