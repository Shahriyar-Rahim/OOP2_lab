package Inheritance;

class Person{
    String name;
    int agw;

    void showP() {
        System.out.println(name + " " + agw);
    }
}

class Student extends Person{
    int id;
    void showStude(){
        System.out.println(id);
    }

    void showALl() {
        System.out.println(name + " " + agw + " " + id);
    }
}

public class Main {
    static void main(String[] args) {
        Person pobj = new Person();
        pobj.name = "Rahim";
        pobj.agw = 21;
        pobj.showP();

        Student sobj = new Student();
        sobj.name = "ksf ";
        sobj.agw = 323;
        sobj.id = 3245323;

        sobj.showP();
        sobj.showStude();
        sobj.showALl();
    }
}
