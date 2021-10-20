package rampup;

import java.util.Scanner;

class PersonAgain {
    String name;
    double salary;
    char gender;
    HomeAddress address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public HomeAddress getAddress() {
        return address;
    }

    public void setAddress(HomeAddress home) {
        this.address = home;
    }

}

class HomeAddress {
    String fullAddress;
    String pinCode;

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

}

public class PersonUsingGetterSetter {
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

        PersonAgain personAgain = new PersonAgain();
        personAgain.setGender(gender);
        personAgain.setName(name);
        personAgain.setSalary(salary);

        HomeAddress home = new HomeAddress();
        home.setFullAddress(fullAddress);
        home.setPinCode(pinCode);
        personAgain.setAddress(home);

        System.out.println("Name= " + personAgain.getName() +
                "\nSalary= " + personAgain.getSalary() +
                "\nGender= " + personAgain.getGender() +
                "\nHome Address= " + (personAgain.getAddress()).getFullAddress() +
                "\nPin Code= " + (personAgain.getAddress()).getPinCode()
        );
    }
}
