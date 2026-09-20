package final_reference;

class Person{
    int a;

    Person(int n) {
        this.a = n;
    }
}

public class Main {
    static void main(){
        final Person p = new Person(24);
        System.out.println(p.a);

        p.a = 222;
    }
}
