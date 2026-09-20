package anonnymusSubclass;

abstract class Person{
    String name;
    int age;
    abstract void displayRole();

    void displayBasicInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

abstract class Student extends Person{
    int id;

    Student(String n, int a, int i){
        name = n;
        age = a;
        id = i;
    }

//    @Override
//    void displayRole(){
//        System.out.println("Role: Student");
//    }

    void displayStudentInfo(){
        displayBasicInfo();
        System.out.println("Id: "+ id);
    }
}

class ftS extends Person{
    @Override
    void displayRole(){
        System.out.println("Role: fth Student");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void displayRole() {
                System.out.println("akshdfv /ald'fgh");
            }
        };
        p.name = "k;dsfgb";
        p.displayBasicInfo();
        p.displayRole();
    }

}
