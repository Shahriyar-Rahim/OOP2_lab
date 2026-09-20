package DynamicMethodDispatch;

class Person{
    String name;
    int age;

    Person(){
        name="'sjbvg";
        age = 235;
    }

    void show(){
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }
}

class Student extends Person{
    int id;

    Student(String n, int a, int ag){
        this.name = n;
        this.age = a;
        id = ag;
    }

    @Override
    void show(){
        System.out.println("Name: " + name + "\n" + "Age: " + age + "\nId: " + id);
    }
}

public class Main {

    public static void main(String[] args) {
        Person p = new Student("sd", 23453, 4325);
        p.show();

        Student s = (Student) new Person(); //runtime error
        s.show();
    }
}
