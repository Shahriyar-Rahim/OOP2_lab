package Inheritance.access;

class Person{
    String name;
    private
    int agw;

    void showP() {
        System.out.println(name + " " + agw);
    }
}

class Student extends Person {
    int id;
    void showStude(){
        System.out.println(id);
    }

    void showALl() {
        System.out.println(name + " " + agw + " " + id);
//        A class member that has been declared
//as private will remain private to its class.
    }
}

public class Main {
    static void main(String[] args) {
        Person pobj = new Person();
        pobj.name = "Rahim";
        pobj.agw = 21;/** It is not accessible by any code outside
         its class, including subclasses.*/
        pobj.showP();

        Student sobj = new Student();
        sobj.name = "ksf ";
        sobj.agw = 323;/** It is not accessible by any code outside
         its class, including subclasses.*/
        sobj.id = 3245323;

        sobj.showP();
        sobj.showStude();
        sobj.showALl();
    }
}
