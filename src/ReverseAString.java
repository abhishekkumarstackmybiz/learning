import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Enter a String:-");
        String string=(new Scanner(System.in)).nextLine();
        String reverseString="";
        for(int i=string.length()-1;i>=0;i--)
            reverseString+=string.charAt(i);
        System.out.println(reverseString);
    }
}
