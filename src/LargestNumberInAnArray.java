import java.util.Scanner;
public class LargestNumberInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Arguments");
        int numberOfArguments=sc.nextInt();
        int []arr=new int[numberOfArguments];
        System.out.println("Enter "+numberOfArguments+" values");
        for(int i=0;i<numberOfArguments;i++)
            arr[i]=sc.nextInt();
        int largestElement=0;
        for(int i=0;i<numberOfArguments;i++)
        {
            if(largestElement<arr[i])
                largestElement=arr[i];
        }
        System.out.println(largestElement+" is the Largest Number");
    }
}
