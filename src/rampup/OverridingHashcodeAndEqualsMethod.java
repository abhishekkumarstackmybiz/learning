package rampup;

class Test {
    int roll;
    String name;

    public Test(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (roll != test.roll) return false;
        return name != null ? name.equals(test.name) : test.name == null;
    }

    @Override
    public int hashCode() {
        int result = roll;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class OverridingHashcodeAndEqualsMethod {
    public static void main(String[] args) {
        Test test1 = new Test(9, "abc");
        Test test2 = new Test(18, "def");
        Test test3 = new Test(9, "abc");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test3));

    }
}
