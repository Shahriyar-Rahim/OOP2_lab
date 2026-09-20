package upcasting_method;

class Person{
    static void display() {
        System.out.println("Person");
    }
}

class Student extends Person{
    static void display(){
        System.out.println("Student");
    }
}

public class Main {
    static void main(String[] args) {
//        Person p = new Student();
//        p.display();
        Person.display();
    }
}
