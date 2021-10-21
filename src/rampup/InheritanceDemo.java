package rampup;

class Human {
    String name;
    String address;
    char gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Student extends Human {
    int roll;
    String studentClass;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Gender=" + gender +
                ", Roll=" + roll +
                ", Student Class='" + studentClass + '\'' +
                '}';
    }
}

class Staff extends Human {
    String experience;
    String staffId;

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Gender=" + gender +
                ", Experience='" + experience + '\'' +
                ", Staff ID='" + staffId + '\'' +
                '}';
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Abhishek kumar");
        student.setGender('M');
        student.setAddress("Ranchi");
        student.setRoll(37);
        student.setStudentClass("MCA");

        Staff staff = new Staff();
        staff.setStaffId("S101");
        staff.setName("ABC");
        staff.setExperience("0 yrs");
        staff.setGender('M');
        staff.setAddress("ABC");

        System.out.println(staff);
        System.out.println(student);
    }
}
