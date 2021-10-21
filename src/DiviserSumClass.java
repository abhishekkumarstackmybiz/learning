import java.util.Scanner;
import java.util.stream.IntStream;

public class DiviserSumClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer i=IntStream.range(1,n+1).filter(e->n%e==0).reduce(0,(n1,n2)->n1+n2);
        System.out.println("Sum:-"+i);
    }
}
