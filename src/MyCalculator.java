import java.util.Scanner;
import java.util.stream.IntStream;

class MyCalculator implements AdvancedArithmetic {
    int n;

    @Override
    public int divisor_sum(int n) {
        System.out.println("I implemented: AdvancedArithmetic");
        return IntStream.range(1, n + 1).filter(e -> n % e == 0).reduce(0, (n1, n2) -> n1 + n2);
    }
}

