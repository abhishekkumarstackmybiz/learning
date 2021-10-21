package rampup;

class OverloadedSum {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }

    void sum(double a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, double b) {
        System.out.println(a + b);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        OverloadedSum overloadedSum = new OverloadedSum();
        overloadedSum.sum(10, 20);
        overloadedSum.sum(23.5, 78);
        overloadedSum.sum(89, 23.45);
        overloadedSum.sum(34.4, 56.6);
    }
}
