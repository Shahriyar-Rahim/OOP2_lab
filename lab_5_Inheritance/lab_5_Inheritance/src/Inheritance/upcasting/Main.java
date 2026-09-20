package Inheritance.upcasting;

class Person{
    String name;
    int agw;

    void showP() {
        System.out.println(name + " " + agw);
    }
}

class Student extends Person {
    int id;

    Student(String name, int a, int id){
        this.name = name;
        agw = a;
        this.id = id;
    }
    void showStude(){
        System.out.println(id);
    }

    void showALl() {
        System.out.println(name + " " + agw + " " + id);
    }
}

public class Main {
    static void main(String[] args) {
        Student stobj = new Student("sdfs2", 2323, 3232);

        System.out.println(stobj.id);
        stobj.showP();

        Person pobj = stobj;

        System.out.println(pobj.name);
        System.out.println(pobj.agw);
        pobj.showP();

        System.out.println(pobj.id); // Error can not access not defined

        Person p = new Person();

        Student s = person; // Error: can not possible this\
        Student ss = (Student) person; // Error: can not assign person  reference to Student
        System.out.println(ss.id); // this will produce runtime error
    }
}
