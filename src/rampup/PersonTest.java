package rampup;

import java.util.Scanner;

class Person {
    private String name;
    private double salary;
    private char gender;
    private Address address;

    public Person(String name, double salary, char gender, Address address) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name= " + name + ", Salary= " + salary + ", Gender= " + gender + ",\n" + address;
    }
}

class Address {
    String fullAddress;
    String pinCode;

    public Address(String fullAddress, String pinCode) {
        this.fullAddress = fullAddress;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Full Address= " + fullAddress + ", PinCode= " + pinCode;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        String name;
        double salary;
        char gender;
        String fullAddress;
        String pinCode;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter salery");
        salary = sc.nextDouble();
        System.out.println("Enter gender(M/F)");
        gender = sc.next().charAt(0);
        System.out.println("Enter Address");
        sc.nextLine();
        fullAddress = sc.nextLine();
        System.out.println("Enter pincode");
        pinCode = sc.nextLine();

        Person person = new Person(name, salary, gender, new Address(fullAddress, pinCode));
        System.out.println(person);
    }
}
