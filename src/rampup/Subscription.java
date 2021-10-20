package rampup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subscription {
    Set<String> subscriber=new HashSet<>();
    public void addSubscriber(String email){
        subscriber.add(email);
    }
    public void showList(){
        subscriber.stream().forEach(System.out::println);
    }
}
class AddSubscriber{
    public static void main(String[] args) {
        Subscription subscription=new Subscription();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter Email:- ");
            subscription.addSubscriber(sc.next());
            System.out.println("Do You Want To Add More :- ");
        }while ((sc.next().charAt(0))=='y');
        System.out.println("List Of Subscriber :- ");
        subscription.showList();
    }
}
