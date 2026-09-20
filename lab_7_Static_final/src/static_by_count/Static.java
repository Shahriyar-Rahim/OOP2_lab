package static_by_count;

class Person{
    static  int count = 0;

    Person() {
//        static  int count = 0; it is not allowe here in the constructor
        count++;
        System.out.println(count);
    }
}

public class Static {
    static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
    }
}
