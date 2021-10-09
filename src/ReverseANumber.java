import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number:-");
        int number=(new Scanner(System.in)).nextInt();
        System.out.println("Reverse Of "+number+" is :");
        int reverse=0;
        for(;number>0;number/=10)
            reverse=reverse*10+(number%10);
        System.out.println(reverse);
    }
}
