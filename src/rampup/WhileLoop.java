package rampup;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class WhileLoopImplementation {
    Set<String> hashSet = new HashSet<>();

    public void setHashSet(String hashSet) {
        this.hashSet.add(hashSet);
    }

    public void showElements() {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

public class WhileLoop {
    public static void main(String[] args) {
        WhileLoopImplementation whileLoopImplementation = new WhileLoopImplementation();
        whileLoopImplementation.setHashSet("abc");
        whileLoopImplementation.setHashSet("kl");
        whileLoopImplementation.setHashSet("efg");
        whileLoopImplementation.setHashSet("hij");
        whileLoopImplementation.setHashSet("cde");
        whileLoopImplementation.showElements();
    }
}
