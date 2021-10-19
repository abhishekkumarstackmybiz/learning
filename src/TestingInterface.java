import java.util.Scanner;

public class TestingInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 1000) {
            System.out.println("wrong Input");
            return;
        }
        MyCalculator obj = new MyCalculator();
        System.out.println(obj.divisor_sum(i));
    }
}
