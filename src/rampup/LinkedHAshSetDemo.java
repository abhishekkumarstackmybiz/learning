package rampup;

import java.util.LinkedHashSet;

class PersonDemo {
    private int age;
    private String name;

    public PersonDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        PersonDemo obj = (PersonDemo) o;
        return this.name.equals(obj.name) && this.age == obj.age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public String toString() {
        return "age=" + age + ", name=" + name;
    }
}

public class LinkedHAshSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<PersonDemo> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new PersonDemo(24, "Abhishek"));
        linkedHashSet.add(new PersonDemo(23, "kumar"));
        linkedHashSet.add(new PersonDemo(24, "Abhishek"));
        linkedHashSet.add(new PersonDemo(25, "abc"));
        linkedHashSet.forEach(System.out::println);
    }
}
