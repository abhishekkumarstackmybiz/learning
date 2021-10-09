import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        int number=(new Scanner(System.in)).nextInt();
        int count=2;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                count++;
                break;
            }
        }
        if(count>2||number==1)
            System.out.println(number+" Is Not Prime");
        else
            System.out.println(number+" Is Prime");
    }
}
