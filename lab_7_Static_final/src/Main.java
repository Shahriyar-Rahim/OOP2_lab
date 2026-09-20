class Student {
    static String uni = "LFN";
    String name;
    int age;

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
        System.out.println("University: "+ uni);
    }
}

public class Main{
    static void main(String[] args) {
        Student s = new Student();
        s.uni = "aidfhg";
        s.name = "aldfg";
        s.age = 234;
        s.show();

        Student s1 = new Student();
//        s1.uni = "rgblsnvk";
        s1.name = "lrng";
        s1.age = 24;
        s1.show();
    }
}