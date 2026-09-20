package static_keywodAndInstance;

class Person{
    static int count = 100;
    static void showCount(){
        System.out.println("Person count: " + count);
    }
}

class Student extends Person{
    int a;
}

public class Main {
    static void main(){
        System.out.println(Person.count);
        System.out.println(Student.count);
        Student.showCount();
    }
}
