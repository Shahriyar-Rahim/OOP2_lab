package static_final;

class Person{
    void show(){
        System.out.println("Normal Method: Person");
    }

    static void display() {
        System.out.println("Static method Person");
    }
}

class Student extends Person{
    @Override
    void show() {
        System.out.println("Normal Method: Person");
    }

    //@Override // The method display() of type Student must override or implement a supertype
    // method
    static void display() {
        System.out.println("Static method Person");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        p.display();
    }
}
