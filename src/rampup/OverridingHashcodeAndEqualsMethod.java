package rampup;

import java.util.Objects;

class Test{
    int roll;
    String name;

    public Test(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Test test=(Test)o;
        return this.roll == test.roll && this.name.equals((test.name));
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return roll+"@"+hashCode();
    }
}
public class OverridingHashcodeAndEqualsMethod {
    public static void main(String[] args) {
        Test test1=new Test(9,"abc");
        Test test2=new Test(18,"def");
        Test test3=new Test(27,"abc");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test3));

    }
}
