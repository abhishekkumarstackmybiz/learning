import java.util.HashMap;

class InputOutputForHashMap {
    HashMap<String, String> hashMap = new HashMap<>();

    public void addHashMap(String key, String value) {
        hashMap.put(key, value);
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
        InputOutputForHashMap obj = new InputOutputForHashMap();
        obj.checkForEmpty();
        obj.addHashMap("aa", "Ant");
        obj.addHashMap("bb", "Bat");
        obj.addHashMap("cc", "Cat");
        obj.showItem();
        obj.checkForEmpty();
    }
}
