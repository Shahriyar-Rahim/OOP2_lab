package problem_1;

class Person{
    String name;
    int age;

    void displayDetails(){
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }
}

class Student extends Person{
    String id;

    void displayStudentId(){
        System.out.println("Id: " + id);
    }
}

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "ksdb";
        p.age = 345;
        p.displayDetails();

        Student s = new Student();
        s.id = "Ten";
        s.displayStudentId();
    }
}
