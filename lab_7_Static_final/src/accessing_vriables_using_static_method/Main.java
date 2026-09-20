package accessing_vriables_using_static_method;

class Person{
    static int age;

    void show(){
        System.out.println(age);
    }
}

public class Main {
    static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.age = 10;
        p2.age = 9345;

        //Person.show(); // it is a ambiguity error that is we can not accces static variable from a non static method or vice-verca
//        Person.show(p1);
    }
}
