import java.util.HashMap;
import java.util.Map;

class InputOutputForHashMap {
    HashMap<String, String> hashMap = new HashMap<>();

    InputOutputForHashMap(Map<String,String> mergeMap) {
        hashMap.putAll(mergeMap);
    }

    void showItem() {
        System.out.println(hashMap);
    }

    void checkForEmpty() {
        if (hashMap.isEmpty()) {
            System.out.println("HashMap Is Empty");
        } else {
            System.out.println("HashMap Is Not Empty");
        }
    }
}

public class AddElementToHashMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("aa", "Ant");
        map.put("bb", "Bat");
        map.put("cc", "Cat");
        InputOutputForHashMap obj = new InputOutputForHashMap(map);
        obj.checkForEmpty();
        obj.showItem();
    }
}
