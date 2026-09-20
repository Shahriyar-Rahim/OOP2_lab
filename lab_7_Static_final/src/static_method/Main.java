package static_method;

class Person{
    static  int count = 0;

    static void display() {
        System.out.println("Person");
    }
}

class Student extends Person{
    static void display() {
        System.out.println("Student");
    }
}


public class Main {
    static void main(String[] args) {
        Person.display();
        Student.display();
    }
}
